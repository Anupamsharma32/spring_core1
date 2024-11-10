package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student student=(Student) applicationContext.getBean("firstStudent");
//        System.out.println(student);
//        System.out.println(student.study());
        Student student=(Student) applicationContext.getBean("getStudent");
        student.study();
    }
}
