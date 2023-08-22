package com.patterns.decorator.dynamic;

import com.patterns.decorator.dynamic.interfaces.Shape;
import com.patterns.decorator.dynamic.models.Circle;
import com.patterns.decorator.dynamic.models.ColoredShape;
import com.patterns.decorator.dynamic.models.TransparentShape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape shape = new Circle(10);
        System.out.println(shape.info());

        shape = new ColoredShape(
                new Circle(10),
                "blue"
        );
        System.out.println(shape.info());

        shape = new TransparentShape(
                new ColoredShape(
                        new Circle(40),
                        "gray"
                ),
                50
        );
        System.out.println(shape.info());
    }
}
