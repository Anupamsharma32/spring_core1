package com.springcore.auto.wire;

public class Address {
    private String city;
    private String stret;

    public String getStret() {
        return stret;
    }

    public void setStret(String stret) {
        this.stret = stret;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", stret='" + stret + '\'' +
                '}';
    }
}
