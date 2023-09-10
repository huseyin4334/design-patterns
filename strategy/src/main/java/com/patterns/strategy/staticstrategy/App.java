package com.patterns.strategy.staticstrategy;


import com.patterns.strategy.dynamic.models.HtmlStrategy;
import com.patterns.strategy.dynamic.models.MarkdownStrategy;
import com.patterns.strategy.dynamic.models.OutputFormat;
import com.patterns.strategy.staticstrategy.models.TextProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        TextProcessor<MarkdownStrategy> tp = new TextProcessor<>(MarkdownStrategy::new);

        tp.appendList(new String[] {"foo", "bar", "baz"});
        System.out.println(tp);

        TextProcessor<HtmlStrategy> tp2 = new TextProcessor<>(HtmlStrategy::new);
        tp2.appendList(new String[] {"foo", "bar", "baz"});
        System.out.println(tp2);
    }

    /*
        Enables the exact behavior of a system to be selected either at run-time (dynamic) or compile-time (static).

        That's example of static strategy pattern. It's static because we have to specify the strategy at compile time.

        More info: https://refactoring.guru/design-patterns/strategy
     */
}
