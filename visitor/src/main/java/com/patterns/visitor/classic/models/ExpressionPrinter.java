package com.patterns.visitor.classic.models;

import com.patterns.visitor.classic.interfaces.ExpressionVisitor;

public class ExpressionPrinter implements ExpressionVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Expression expression) {
        if (expression instanceof DoubleExpression) {
            sb.append(((DoubleExpression) expression).value);
        } else if (expression instanceof AdditionExpression) {
            AdditionExpression ae = (AdditionExpression) expression;
            sb.append("(");
            ae.left.accept(this);
            sb.append("+");
            ae.right.accept(this);
            sb.append(")");
        }
    }

    @Override
    public void visit(DoubleExpression doubleExpression) {
        sb.append(doubleExpression.value);
    }

    @Override
    public void visit(AdditionExpression additionExpression) {
        sb.append("(");
        additionExpression.left.accept(this);
        sb.append("+");
        additionExpression.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
