package com.patterns.builder.fluent;

import com.patterns.builder.fluent.models.EmployeeBuilder;
import com.patterns.builder.fluent.models.HtmlBuilder;
import com.patterns.builder.fluent.models.Person;

/**
 * Hello world!
 *
 */
public class App
{

    public static void fluentBuilder() {
        HtmlBuilder builder = new HtmlBuilder("ul");

        builder.addChild("li", "hello")
                .addChild("li", "world")
                .addChild("li", "how is going on");

        System.out.println(builder);
    }

    public static void fluentBuilderFixInheritance() {
        EmployeeBuilder builder = new EmployeeBuilder();

        Person p = builder.name("Huseyin")
                .position("Software Developer")
                .build();

        System.out.println(p);
    }
    public static void main( String[] args ) {

        fluentBuilder();
    }
}
