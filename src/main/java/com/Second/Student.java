package com.Second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    int id;
    String name;
    double marks;


    // =========================================================
    // METHOD 1 - Field Injection using @Value (Dependency Injection)
    // =========================================================

    /*
    @Value("101")
    int id;

    @Value("90.0")
    double marks;

    @Value("Nandan")
    String name;
    */


    // =========================================================
    // METHOD 2 - Constructor Injection using @Value
    // =========================================================

    /*
    public Student(
            @Value("101") int id,
            @Value("90.0") double marks,
            @Value("Nandan") String name) {

        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    */


    // =========================================================
    // METHOD 3 - Setter Injection using @Value
    // =========================================================

    @Value("101")
    public void setId(int id) {
        this.id = id;
    }

    @Value("90.0")
    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Value("Nandan")
    public void setName(String name) {
        this.name = name;
    }


    // =========================================================
    // toString()
    // =========================================================

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", marks=" + marks + "]";
    }
}