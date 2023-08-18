package com.patterns.bridge.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {
    protected Color color;

    abstract public String draw();
}
