package com.patterns.visitor.acyclic.models;

import com.patterns.visitor.acyclic.interfaces.ExpressionVisitor;
import com.patterns.visitor.acyclic.interfaces.Visitor;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

}
