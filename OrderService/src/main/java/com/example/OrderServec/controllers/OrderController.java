package com.example.OrderServec.controllers;

import com.example.OrderServec.models.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @GetMapping("/by-user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable Long userId) {
        return null;
    }
}
