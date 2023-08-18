package com.patterns.singleton.innerstatic;

public class InnerStaticSingleton {

    private InnerStaticSingleton() {}

    private static class Impl {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.instance;
    }
}
