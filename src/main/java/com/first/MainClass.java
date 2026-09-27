package com.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        // AnnotationConfigApplicationContext app =
        //         new AnnotationConfigApplicationContext("com.first");

        // OR

        ApplicationContext app =
                new AnnotationConfigApplicationContext("com.first");


        // ---------------------------------------------------------
        // Get all Bean Definition Names
        // ---------------------------------------------------------

        String names[] = app.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }


        // Get total number of Bean Definitions
        int objCount = app.getBeanDefinitionCount();

        System.out.println("Total Bean Count: " + objCount);


        System.out.println("---------------------------------------------------------");


        // =========================================================
        // How to Get an Object from Spring Container
        // =========================================================


        // =========================================================
        // PERSON
        // =========================================================

        // Case 1 - Return Component Object Directly using Class
        Person p1 = app.getBean(Person.class);

        System.out.println("Person using Class: " + p1);

        p1.eat();


        // Case 2 - Return Component Object in Object Format
        Object obj = app.getBean("person");

        // Downcasting
        Person p2 = (Person) obj;

        System.out.println("Person using Bean Name + Downcasting: " + p2);

        p2.eat();


        // Case 3 - Return Component Object Directly using Bean Name and Class
        Person p3 = app.getBean("person", Person.class);

        System.out.println("Person using Bean Name + Class: " + p3);

        p3.eat();


        // =========================================================
        // BOOK
        // =========================================================

        // Case 1 - Return Component Object Directly using Class
        Book b1 = app.getBean(Book.class);

        System.out.println("Book using Class: " + b1);

        b1.read();


        // Case 2 - Return Component Object in Object Format
        Object obj2 = app.getBean("book");

        // Downcasting
        Book b2 = (Book) obj2;

        System.out.println("Book using Bean Name + Downcasting: " + b2);

        b2.read();


        // Case 3 - Return Component Object Directly using Bean Name and Class
        Book b3 = app.getBean("book", Book.class);

        System.out.println("Book using Bean Name + Class: " + b3);

        b3.read();


        System.out.println("---------------------------------------------------------");


        // =========================================================
        // IN-BUILT CLASS
        // =========================================================

        // Getting Scanner object directly using Class
        Scanner sc = app.getBean(Scanner.class);

        System.out.println("Scanner Object: " + sc);


        /*
         * Alternative way:
         *
         * Scanner s = (Scanner) app.getBean("getScanner");
         * System.out.println(s);
         */


        /*
         * Object o1 = app.getBean(Object.class); // Error
         * System.out.println(o1);
         *
         * Error:
         * getBean(Object.class) finds multiple beans because
         * all beans inherit from Object.
         *
         * Use the bean name to identify the specific bean:
         *
         * app.getBean("getObject");
         */


        // Getting the specific Object bean using Bean Name + Class
        /*Object o2 = app.getBean("getObject", Object.class);

        System.out.println("Object Bean: " + o2);
        */
        Object o3=app.getBean("getObject");
        System.out.println(o3);


        // Getting Exception object using Class
        Exception e1 = app.getBean(Exception.class);

        System.out.println("Exception Object: " + e1);

    }
}