package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config5.xml");
//        AbstractApplicationContext is parent interface for ApplicationContext
//        it has the method registerShutDownHook() in order to do it we are using AbstractApplicationContext interface
        Samosa samosa=(Samosa) applicationContext.getBean("s1");
        System.out.println(samosa);
        applicationContext.registerShutdownHook();

        System.out.println("***********************");
        Pepsi pepsi=(Pepsi) applicationContext.getBean("p1");
        System.out.println(pepsi);


    }
}
