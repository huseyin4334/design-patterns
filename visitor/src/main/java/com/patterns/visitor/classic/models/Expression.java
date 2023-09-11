package com.patterns.visitor.classic.models;

import com.patterns.visitor.classic.interfaces.ExpressionVisitor;

public abstract class Expression {

    public abstract void accept(ExpressionVisitor visitor);

}
