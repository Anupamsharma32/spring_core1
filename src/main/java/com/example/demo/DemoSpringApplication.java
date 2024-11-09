package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpringApplication {

	public static void main(String[] args) {
		System.out.println("This is main function");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		Student s1=(Student) applicationContext.getBean("student1");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentAddress());
		ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("config.xml");
		Student s2=(Student) applicationContext1.getBean("student2");
		System.out.println(s2.getStudentName());
	}

}
