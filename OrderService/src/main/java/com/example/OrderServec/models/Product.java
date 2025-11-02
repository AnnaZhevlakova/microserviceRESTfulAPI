package com.example.OrderServec.models;

public class Product {
    private String productName;
    private Integer quantity;
    private Double price;

    public Product(){

    }

    public Product(String productName, Integer quantity, Double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName(){
        return  productName;
    }

    public void setProductNamep(String productName){
        this.productName = productName;
    }

    public Integer getQuantity(){
        return  quantity;
    }

    public  void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public  Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

}
