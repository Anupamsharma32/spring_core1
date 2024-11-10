package com.springcore.javaconfig;


import com.springcore.javaconfig.Samosa;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {

    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study(){
        this.samosa.display();
        System.out.println("student is stdying");
    }

}
