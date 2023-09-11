package com.patterns.visitor.classic.models;

import com.patterns.visitor.classic.interfaces.ExpressionVisitor;

public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
