package com.patterns.composite.geometric;

import com.patterns.composite.geometric.models.Circle;
import com.patterns.composite.geometric.models.GraphicObject;
import com.patterns.composite.geometric.models.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GraphicObject graphicObject = new GraphicObject(
                "Gray",
                List.of(
                        new Circle("Red", List.of(
                                new Square("White", new ArrayList<>())
                        )),
                        new GraphicObject("Rectangle", new ArrayList<>(), "Yellow")
                )
        );

        System.out.println(graphicObject);
    }

    /*
        Composite is a structural design pattern that lets you compose objects into tree structures and then work
        with these structures as if they were individual objects.
        More: https://refactoring.guru/design-patterns/composite
     */
}
