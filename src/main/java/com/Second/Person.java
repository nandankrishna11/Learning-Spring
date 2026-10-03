package com.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    // Constructor Injection

	
	//has-a 
	
    Mobile mob;

    @Autowired
    public Person(Mobile mob) {
        this.mob = mob;
    }

    // Setter Injection
    /*
    @Autowired
    public void setMob(Mobile mob) {
        this.mob = mob;
    }
    */

    public void use() {
        System.out.println("Person is using mobile");
        System.out.println(mob);
        mob.text();
    }
}