package com.example.BFFService.models;

import java.util.List;

public class Order {
    private long id;
    private long userId;
    private double totalAmount;
    private String currency;
    private List<Product> products;

    public Order(){

    }

    public Order(long id, long userId, String currency, List<Product> items){
        this.id = id;
        this.userId = userId;
        this.currency = currency;
        this.products = items;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getUserId(){
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getTotalAmount(){
        if(products == null || products.isEmpty()){
            return 0;
        }
        var result = products.stream()
                .mapToDouble(x -> x.getPrice() * x.getQuantity())
                .sum();
        return result;
    }

    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public List<Product> getProducts(){
        return products;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }



}
