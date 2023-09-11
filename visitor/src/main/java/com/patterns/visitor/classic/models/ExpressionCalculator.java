package com.patterns.visitor.classic.models;

import com.patterns.visitor.classic.interfaces.ExpressionVisitor;

public class ExpressionCalculator implements ExpressionVisitor {

    public double result;

    @Override
    public void visit(Expression expression) {
        if (expression instanceof DoubleExpression) {
            result = ((DoubleExpression) expression).value;
        } else if (expression instanceof AdditionExpression) {
            AdditionExpression ae = (AdditionExpression) expression;
            ae.left.accept(this);
            double left = result;
            ae.right.accept(this);
            double right = result;
            result = left + right;
        }
    }

    @Override
    public void visit(DoubleExpression doubleExpression) {
        result = doubleExpression.value;
    }

    @Override
    public void visit(AdditionExpression additionExpression) {
        additionExpression.left.accept(this);
        double left = result;
        additionExpression.right.accept(this);
        double right = result;
        result = left + right;
    }
}
