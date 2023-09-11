package com.patterns.visitor.acyclic.interfaces;


import com.patterns.visitor.acyclic.models.DoubleExpression;

public interface DoubleExpressionVisitor extends Visitor {
    void visit(DoubleExpression obj);
}
