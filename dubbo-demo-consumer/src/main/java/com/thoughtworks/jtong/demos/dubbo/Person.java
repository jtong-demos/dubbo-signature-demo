package com.thoughtworks.jtong.demos.dubbo;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String gender;

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

}
