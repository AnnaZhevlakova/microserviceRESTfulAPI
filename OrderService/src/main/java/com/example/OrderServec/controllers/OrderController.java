package com.example.OrderServec.controllers;

import com.example.OrderServec.services.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Scope("request")
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/by-user/{userId}")
    public ResponseEntity<?> getOrdersByUser(@PathVariable Long userId) {
        var result = orderService.getOrders(userId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
