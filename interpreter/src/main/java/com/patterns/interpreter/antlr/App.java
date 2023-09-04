package com.patterns.interpreter.antlr;

import com.patterns.interpreter.lexing.models.Token;
import io.druid.math.expr.antlr.ExprBaseListener;
import io.druid.math.expr.antlr.ExprLexer;
import io.druid.math.expr.antlr.ExprParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) {
        String input = "(13+4)-(12+1)";
        System.out.println("input: " + input);

        // create a lexer that feeds off of input CharStream
        ExprLexer lexer = new ExprLexer(new ANTLRInputStream(input));

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ExprParser parser = new ExprParser(tokens);

        ParseTree tree = parser.expr(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new ExprBaseListener(), tree);

        System.out.println("tree: " + tree.toStringTree(parser)); // print LISP-style tree
    }

    /*
        https://www.antlr.org/
     */
}
