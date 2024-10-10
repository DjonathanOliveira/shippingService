package com.ShipmentProjectSpring.entities;

public class Order {
    private int code;
    private double price;
    private double discount;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Order(int code, double price, double discount){
        this.code = code;
        this.price = price;
        this.discount = discount;
    }

    public Order(){

    }

}
