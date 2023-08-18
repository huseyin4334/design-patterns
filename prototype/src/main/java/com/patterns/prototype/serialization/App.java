package com.patterns.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

public class App {

    public static void main(String[] args) {
        Foo foo = new Foo(2, "Test");

        Foo foo1 = SerializationUtils.roundtrip(foo);

        foo1.setWhatEver("I changed");

        System.out.println(foo);
        System.out.println(foo1);
    }
}
