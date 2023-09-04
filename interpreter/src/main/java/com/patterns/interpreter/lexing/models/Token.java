package com.patterns.interpreter.lexing.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Token {
    public Type type;

    public String text;

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}
