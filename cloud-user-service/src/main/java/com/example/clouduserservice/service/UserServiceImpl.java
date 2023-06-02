package com.example.clouduserservice.service;

import com.example.clouduserservice.cilent.OrderServiceClient;
import com.example.clouduserservice.dto.UserDto;
import com.example.clouduserservice.jpa.UserEntity;
import com.example.clouduserservice.jpa.UserRepository;
import com.example.clouduserservice.vo.ResponseOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    private final Environment env;

    private final RestTemplate restTemplate;

    private final OrderServiceClient orderServiceClient;

    @Override
    public UserDto createUser(final UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mapper.map(userDto, UserEntity.class);
        userEntity.setEncryptedPwd(passwordEncoder.encode(userDto.getPwd()));

        userRepository.save(userEntity);

        return mapper.map(userEntity, UserDto.class);
    }

    @Override
    public UserDto getUserByUserId(final String userId) {
        UserEntity userEntity = userRepository.findByUserId(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        UserDto userDto = new ModelMapper().map(userEntity, UserDto.class);

//        restTemplate
//        String orderUrl = String.format(env.getProperty("order-service.url"), userId);
//        ResponseEntity<List<ResponseOrder>> orderListResponse = restTemplate.exchange(
//                orderUrl, HttpMethod.GET, null,
//                new ParameterizedTypeReference<>() {
//                });
//        List<ResponseOrder> orders = orderListResponse.getBody();

//        feign Client
//        List<ResponseOrder> orders;
//        try {
//            orders = orderServiceClient.getOrders(userId);
//        } catch (FeignException e) {
//            log.error(e.getMessage());
//            return userDto;
//        }

        List<ResponseOrder> orders = orderServiceClient.getOrders(userId);

        userDto.setOrders(orders);

        return userDto;
    }

    @Override
    public Iterable<UserEntity> getUserByAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserDetailsByEmail(final String username) {
        UserEntity userEntity = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));

        return new ModelMapper().map(userEntity, UserDto.class);
    }

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));

        return new User(userEntity.getEmail(), userEntity.getEncryptedPwd()
                , true, true, true, true
                , new ArrayList<>());
    }

}
