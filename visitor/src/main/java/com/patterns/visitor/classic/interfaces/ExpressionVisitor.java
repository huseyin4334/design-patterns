package com.patterns.visitor.classic.interfaces;

import com.patterns.visitor.classic.models.AdditionExpression;
import com.patterns.visitor.classic.models.DoubleExpression;
import com.patterns.visitor.classic.models.Expression;

public interface ExpressionVisitor {

        void visit(Expression expression);

        void visit(DoubleExpression doubleExpression);

        void visit(AdditionExpression additionExpression);
}
