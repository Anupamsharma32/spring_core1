package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {
    private String sub;

    @Override
    public String toString() {
        return "Example{" +
                "sub='" + sub + '\'' +
                '}';
    }

    public Example(){
        super();
    }
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
