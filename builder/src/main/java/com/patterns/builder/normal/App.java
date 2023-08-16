package com.patterns.builder.normal;

import com.patterns.builder.normal.models.HtmlBuilder;
import com.patterns.builder.normal.models.HtmlElement;

/**
 * Hello world!
 *
 */
public class App
{

    public static void stringBuilderTest() {
        String [] words = {"hello", "john"};

        StringBuilder s = new StringBuilder();

        s.append("<ul>\n");

        for (String word : words) {
            s.append(String.format("    <li>%s</li>\n", word));
        }
        s.append("</ul>");

        System.out.println(s);
    }

    public static void customBuilder() {
        HtmlBuilder builder = new HtmlBuilder("ul");

        builder.addChild("li", "hello");
        builder.addChild("li", "world");

        System.out.println(builder);
    }
    public static void main( String[] args ) {

        stringBuilderTest();

        customBuilder();
    }
}
