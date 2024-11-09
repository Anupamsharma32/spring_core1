package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config3.xml");
        A obj=(A)applicationContext.getBean("aref");
        System.out.println(obj.getX());
        System.out.println(obj.getOb().getY());
    }
}
