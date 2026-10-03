package com.Second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext app =
                new AnnotationConfigApplicationContext("com.Second");

        Student s = app.getBean(Student.class);

        System.out.println(s);
        
        Person p = app.getBean(Person.class);
        System.out.println(p);

        p.use();
    }
}