package com.patterns.proxy.functionality.models;

import com.patterns.proxy.functionality.interfaces.Drivable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car implements Drivable {

    protected Driver driver;
    @Override
    public void drive() {
        System.out.println("Car have driven by " + driver.getName());
    }
}
