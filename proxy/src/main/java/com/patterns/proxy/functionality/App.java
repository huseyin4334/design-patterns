package com.patterns.proxy.functionality;

import com.patterns.proxy.functionality.models.CarProxy;
import com.patterns.proxy.functionality.models.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarProxy carProxy = new CarProxy(
                new Driver("Huseyin", 14)
        );
        carProxy.drive();
    }

    /*
        We can use this pattern for restrict the accessibility functions or properties.
        More: https://refactoring.guru/design-patterns/proxy
     */
}
