package com.isaccanedo.orderservice.client;

public interface OrderClient {

    OrderResponse order(OrderDTO orderDTO);
}
