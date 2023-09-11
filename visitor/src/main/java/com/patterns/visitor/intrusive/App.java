package com.patterns.visitor.intrusive;

import com.patterns.visitor.intrusive.models.AdditionExpression;
import com.patterns.visitor.intrusive.models.DoubleExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // 1+(2+3)
        AdditionExpression e = new AdditionExpression(
            new DoubleExpression(1),
            new AdditionExpression(
                new DoubleExpression(2),
                new DoubleExpression(3)
            )
        );

        StringBuilder sb = new StringBuilder();
        e.print(sb);

        System.out.println(sb);
    }

    /*
        A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy.
        Implemented by propagating a single visit() method throughout the entire hierarchy
     */
}
