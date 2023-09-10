package com.patterns.state.classic.models;

public class OffState extends State {

    public OffState() {
        System.out.println("Light turned off");
    }

    @Override
    public void on(LightSwitch ls) {
        System.out.println("Switching light on...");
        ls.setState(new OnState());
    }
}
