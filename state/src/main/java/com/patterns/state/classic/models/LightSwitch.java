package com.patterns.state.classic.models;

public class LightSwitch {

    private State state;

    public LightSwitch() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        state.on(this); // this is the context
    }

    public void off() {
        state.off(this); // this is the context
    }
}
