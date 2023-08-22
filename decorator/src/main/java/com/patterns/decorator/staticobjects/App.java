package com.patterns.decorator.staticobjects;


import com.patterns.decorator.dynamic.models.Circle;
import com.patterns.decorator.staticobjects.models.ColoredShape;
import com.patterns.decorator.staticobjects.models.TransparentShape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ColoredShape<Circle> shape = new ColoredShape<>(
                () -> new Circle(10),
                "blue"
        );
        System.out.println(shape.info());

        TransparentShape<ColoredShape<Circle>> transparentShape = new TransparentShape<>(
                () -> new ColoredShape<>(
                        () -> new Circle(40),
                        "gray"
                ),
                50
        );
        System.out.println(transparentShape.info());
    }
}
