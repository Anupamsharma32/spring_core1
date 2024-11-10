package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config10.xml");
        Student student=applicationContext.getBean("student", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
    }
}
