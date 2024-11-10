package com.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config8.xml");
        Emp emp=applicationContext.getBean("emp1",Emp.class);
        System.out.println(emp);
    }
}
