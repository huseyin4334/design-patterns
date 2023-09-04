package com.patterns.interpreter.parsing.models;

import com.patterns.interpreter.parsing.interfaces.Element;

public class BinaryOperation implements Element {

    public enum Type {
        ADDITION,
        SUBTRACTION
    }

    public Type type;

    public Element left, right;

    @Override
    public int eval() {
        return switch (type) {
            case ADDITION -> left.eval() + right.eval();
            case SUBTRACTION -> left.eval() - right.eval();
        };
    }
}
