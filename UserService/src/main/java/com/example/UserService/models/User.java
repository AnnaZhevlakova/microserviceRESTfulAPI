package com.example.UserService.models;

public class User {
 private long Id;
 private String fullName;
 private  String deliveryAddress;
 private String phoneNumber;
 private  String email;

  public  User(){};

  public User(Long id,String fullName, String deliveryAddress,String phoneNumber, String email){
      this.Id = id;
      this.fullName = fullName;
      this.deliveryAddress = deliveryAddress;
      this.phoneNumber = phoneNumber;
      this.email = email;
  }

    public long getId() {
        return Id;
  }

    public void setId(long id) {
        Id = id;
    }

    public String getFullName(){
      return fullName;
    }

    public void setFullName(String fullName){
      this.fullName = fullName;
    }

    public String getDeliveryAddress(){
      return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress){
      this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber(){
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
      return email;
  }

    public void setEmail(String email) {
        this.email = email;
    }
}
