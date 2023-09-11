package com.patterns.visitor.classic.models;

import com.patterns.visitor.classic.interfaces.ExpressionVisitor;

public class AdditionExpression extends Expression {

    public Expression left;
    public Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
