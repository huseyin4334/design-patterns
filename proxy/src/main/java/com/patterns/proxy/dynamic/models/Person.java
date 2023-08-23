package com.patterns.proxy.dynamic.models;


import com.patterns.proxy.dynamic.interfaces.Human;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void talk() {
        System.out.println("I am talking");
    }
}
