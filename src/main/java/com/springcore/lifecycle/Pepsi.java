package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public Pepsi(){
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // init method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi");
    }

    // destroy method
    @Override
    public void destroy() throws Exception {
        System.out.println("going to put bottle back to shop after drinking");
    }
}
