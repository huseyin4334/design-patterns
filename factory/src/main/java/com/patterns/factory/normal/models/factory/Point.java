package com.patterns.factory.normal.models.factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Point {
    private double x, y;

    // I create constructor private. Because we don't want it to be accessible from outside

    //We create constructors with different needs.

    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }
    }
}
