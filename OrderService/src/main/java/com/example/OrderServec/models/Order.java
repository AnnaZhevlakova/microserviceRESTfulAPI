package com.example.OrderServec.models;

import java.util.List;

public class Order {
    private Long id;
    private Long userId;
    private Double totalAmount;
    private String currency;
    private List<Product> products;

    public Order(){

    }

    public Order(Long id, Long userId, Double totalAmount, String currency,List<Product> items){
        this.id = id;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.currency = currency;
        this.products = items;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getUserId(){
        return userId;
    }
    public Double getTotalAmount(){
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount){
        this.totalAmount = totalAmount;
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
