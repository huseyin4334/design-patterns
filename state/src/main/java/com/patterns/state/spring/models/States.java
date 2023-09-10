package com.patterns.state.spring.models;

public enum States {

    OFF_HOOK, // starting
    ON_HOOK,  // terminal
    CONNECTING, // transitional
    CONNECTED, // terminal
    ON_HOLD // transitional
}
