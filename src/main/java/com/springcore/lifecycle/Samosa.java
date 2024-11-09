package com.springcore.lifecycle;

public class Samosa {
    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }

    public Samosa(){
        super();
    }
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price ");
        this.price = price;
    }
}
