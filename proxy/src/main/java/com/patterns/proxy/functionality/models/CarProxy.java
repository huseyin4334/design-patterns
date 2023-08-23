package com.patterns.proxy.functionality.models;

public class CarProxy extends Car {
    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.getAge() < 18)
            System.out.println("This driver is under 18 years old. Driver can not drive this car");
        else
            super.drive();
    }
}
