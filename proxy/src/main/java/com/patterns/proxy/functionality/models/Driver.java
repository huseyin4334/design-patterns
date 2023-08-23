package com.patterns.proxy.functionality.models;

import com.patterns.proxy.functionality.interfaces.Drivable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Driver implements Drivable {

    private String name;
    private int age;

    @Override
    public void drive() {
        System.out.println("Driver have driven car.");
    }
}
