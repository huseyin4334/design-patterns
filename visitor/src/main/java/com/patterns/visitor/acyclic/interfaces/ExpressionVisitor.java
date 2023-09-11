package com.patterns.visitor.acyclic.interfaces;


import com.patterns.visitor.acyclic.models.Expression;

public interface ExpressionVisitor extends Visitor {
    void visit(Expression obj);
}
