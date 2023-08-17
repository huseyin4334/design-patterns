package com.patterns.factory.normal;

import com.patterns.factory.normal.models.factory.Point;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // factory pattern functionality
        com.patterns.factory.normal.models.staticfunctions.Point.newPolarPoint(30, 30);

        // factory pattern
        Point.Factory.newPolarPoint(30, 30);
    }
}
