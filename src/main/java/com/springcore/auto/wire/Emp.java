package com.springcore.auto.wire;

//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

public class Emp {
    private Address address;

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp(){
        super();
    }
    public Emp(Address adr){
        super();
        System.out.println("inside constructor");

        this.address=adr;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
