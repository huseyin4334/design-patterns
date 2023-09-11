package com.patterns.visitor.reflective;


import com.patterns.visitor.reflective.models.AdditionExpression;
import com.patterns.visitor.reflective.models.DoubleExpression;
import com.patterns.visitor.reflective.models.ExpressionPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1 + (2+3)
        AdditionExpression e = new AdditionExpression(
            new DoubleExpression(1),
            new AdditionExpression(
                new DoubleExpression(2),
                new DoubleExpression(3)
            )
        );
        StringBuilder sb = new StringBuilder();
        ExpressionPrinter.print(e, sb);
        System.out.println(sb);
    }

    /*
        A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy.
        Implemented by propagating a single visit() method throughout the entire hierarchy
     */
}
