package com.thoughtworks.jtong.demos.dubbo;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}
