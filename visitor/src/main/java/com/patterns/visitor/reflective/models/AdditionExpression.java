package com.patterns.visitor.reflective.models;

public class AdditionExpression extends Expression {

    public Expression left;
    public Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
