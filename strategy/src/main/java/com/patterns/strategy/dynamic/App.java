package com.patterns.strategy.dynamic;

import com.patterns.strategy.dynamic.models.OutputFormat;
import com.patterns.strategy.dynamic.models.TextProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.appendList(new String[] {"foo", "bar", "baz"});
        System.out.println(tp);

        tp.clear();
        tp.setOutputFormat(OutputFormat.HTML);
        tp.appendList(new String[] {"foo", "bar", "baz"});
        System.out.println(tp);
    }

    /*
        Enables the exact behavior of a system to be selected either at run-time (dynamic) or compile-time (static).

        That's example of dynamic strategy pattern. Because it's possible to change the strategy at runtime.

        More info: https://refactoring.guru/design-patterns/strategy
     */
}
