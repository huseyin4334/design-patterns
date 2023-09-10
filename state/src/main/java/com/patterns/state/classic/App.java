package com.patterns.state.classic;

import com.patterns.state.classic.models.LightSwitch;

public class App {

    public static void main(String[] args) {
        LightSwitch ls = new LightSwitch();
        ls.on();
        ls.off();
        ls.off();
    }
}
