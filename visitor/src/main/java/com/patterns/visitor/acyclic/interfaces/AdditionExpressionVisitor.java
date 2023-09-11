package com.patterns.visitor.acyclic.interfaces;


import com.patterns.visitor.acyclic.models.AdditionExpression;

public interface AdditionExpressionVisitor extends Visitor {
    void visit(AdditionExpression obj);
}
