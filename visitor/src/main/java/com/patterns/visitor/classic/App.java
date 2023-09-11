package com.patterns.visitor.classic;

import com.patterns.visitor.classic.models.AdditionExpression;
import com.patterns.visitor.classic.models.DoubleExpression;
import com.patterns.visitor.classic.models.ExpressionCalculator;
import com.patterns.visitor.classic.models.ExpressionPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1+(2+3)
        AdditionExpression additionExpression = new AdditionExpression(
            new DoubleExpression(1),
            new AdditionExpression(
                new DoubleExpression(2),
                new DoubleExpression(3)
            )
        );
        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(additionExpression);
        System.out.println(expressionPrinter);

        ExpressionCalculator calculator = new ExpressionCalculator();
        calculator.visit(additionExpression);
        System.out.println(expressionPrinter + " = " + calculator.result);
    }

    /*
        A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy.
        Implemented by propagating a single visit() method throughout the entire hierarchy
     */
}
