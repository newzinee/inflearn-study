package com.example.cloudorderservice.service;

import com.example.cloudorderservice.dto.OrderDto;
import com.example.cloudorderservice.jpa.OrderEntity;

import java.util.List;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrderByOrderId(String orderId);

    List<OrderEntity> getOrdersByUserId(String userId);

}
