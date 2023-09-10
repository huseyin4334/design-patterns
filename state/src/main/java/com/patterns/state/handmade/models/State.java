package com.patterns.state.handmade.models;

public enum State {

    OFF_HOOK, // starting
    ON_HOOK,  // terminal
    CONNECTING, // transitional
    CONNECTED, // terminal
    ON_HOLD // transitional
}
