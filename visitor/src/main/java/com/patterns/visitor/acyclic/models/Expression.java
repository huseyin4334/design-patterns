package com.patterns.visitor.acyclic.models;

import com.patterns.visitor.acyclic.interfaces.ExpressionVisitor;
import com.patterns.visitor.acyclic.interfaces.Visitor;

public abstract class Expression {
    // optional
    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor) {
            ((ExpressionVisitor) visitor).visit(this);
        }
    }
}
