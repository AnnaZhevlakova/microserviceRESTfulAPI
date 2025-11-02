package com.example.OrderServec.services;

import com.example.OrderServec.models.Order;
import com.example.OrderServec.models.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Scope("request")
@Service
public class OrderService {
    public List<Order> getOrders(long userId) {
        var result = new ArrayList<Order>();
        var products = new ArrayList<Product>();
        products.add(new Product("Phone", 2, 15000));
        result.add(new Order(1, 1, "RUB", products));
        return result;


    }

}
