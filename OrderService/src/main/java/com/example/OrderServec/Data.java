package com.example.OrderServec;

import com.example.OrderServec.models.Order;
import com.example.OrderServec.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Order> testOrder;

    static {
        testOrder = new ArrayList<>();
        var testProduct1 = new ArrayList<Product>();
        testProduct1.add(new Product("Телефон", 2, 60000));
        testProduct1.add(new Product("Наушники", 3, 18000));
        testOrder.add(new Order(1, 1, "RUB", testProduct1));

        var testProduct2 = new ArrayList<Product>();
        testProduct2.add(new Product("Ноут", 1, 80000));
        testProduct2.add(new Product("Мышь", 2, 10000));
        testOrder.add(new Order(2, 2, "RUB", testProduct2));

    }

    public static List<Order> getTestOrder() {
        return testOrder;
    }
}
