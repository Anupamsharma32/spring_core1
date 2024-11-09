package com.example.demo.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi from main method");
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("cconfig.xml","config.xml");
        Emp emp=(Emp)applicationContext.getBean("empBean");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());

    }
}
