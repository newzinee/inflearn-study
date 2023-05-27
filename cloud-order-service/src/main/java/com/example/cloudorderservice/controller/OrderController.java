package com.example.cloudorderservice.controller;

import com.example.cloudorderservice.dto.OrderDto;
import com.example.cloudorderservice.jpa.OrderEntity;
import com.example.cloudorderservice.service.OrderService;
import com.example.cloudorderservice.vo.RequestOrder;
import com.example.cloudorderservice.vo.ResponseOrder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order-service")
@RequiredArgsConstructor
public class OrderController {

    private final Environment env;

    private final OrderService orderService;

    @GetMapping("/health_check")
    public String status() {
        return String.format("It's Working in Order Service on Port %s", env.getProperty("local.server.port"));
    }

    @PostMapping("/{userId}/orders")
    public ResponseEntity<ResponseOrder> createOrder(@RequestBody RequestOrder order,
                                                     @PathVariable String userId) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        OrderDto orderDto = mapper.map(order, OrderDto.class);
        orderDto.setUserId(userId);
        OrderDto createdOrder = orderService.createOrder(orderDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.map(createdOrder, ResponseOrder.class));
    }

    @GetMapping("/{userId}/orders")
    public ResponseEntity<List<ResponseOrder>> getOrders(@PathVariable String userId) {
        List<OrderEntity> orders = orderService.getOrdersByUserId(userId);

        List<ResponseOrder> result = orders.stream()
                .map(v -> new ModelMapper().map(v, ResponseOrder.class))
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

}
