package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config7.xml");
        Emp emp=applicationContext.getBean("emp1",Emp.class);
        System.out.println(emp);
    }
}
