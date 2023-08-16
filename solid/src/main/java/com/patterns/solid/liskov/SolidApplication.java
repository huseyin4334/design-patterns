package com.patterns.solid.liskov;

import com.patterns.solid.liskov.models.Rectangle;
import com.patterns.solid.liskov.models.Square;

public class SolidApplication {

    private static void print(Rectangle r) {

        r.setHeight(3);

        System.out.println(r.toString());
        System.out.println(r.getArea());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 8);
        print(r);

        Square s = new Square(7);
        print(s);

        Rectangle sr = new Square(23);
        print(sr);

    }
}
