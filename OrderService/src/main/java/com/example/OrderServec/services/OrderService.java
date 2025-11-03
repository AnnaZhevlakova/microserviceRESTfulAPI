package com.example.OrderServec.services;

import com.example.OrderServec.Data;
import com.example.OrderServec.models.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Scope("request")
@Service
public class OrderService {
    public List<Order> getOrders(long userId) {
        var result = Data.getTestOrder().stream().filter(x -> x.getUserId() == userId).toList();
        return result;

    }

}



