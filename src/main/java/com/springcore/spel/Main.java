package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config11.xml");
        Demo demo=applicationContext.getBean("demo", Demo.class);
        System.out.println(demo);
        //we can use the below but mostly @Value ke inside use hota hai
//        SpelExpressionParser spelExpressionParser=new SpelExpressionParser();
//        Expression expression=spelExpressionParser.parseExpression("11+191+1");
//        System.out.println(expression.getValue());
    }
}
