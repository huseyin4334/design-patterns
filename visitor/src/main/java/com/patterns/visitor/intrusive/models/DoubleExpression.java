package com.patterns.visitor.intrusive.models;

public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void print(StringBuilder sb) {
        sb.append(value);
    }
}
