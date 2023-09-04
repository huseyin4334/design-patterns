package com.patterns.interpreter.parsing;

import com.patterns.interpreter.lexing.models.Token;
import com.patterns.interpreter.lexing.models.Type;
import com.patterns.interpreter.parsing.interfaces.Element;
import com.patterns.interpreter.parsing.models.BinaryOperation;
import com.patterns.interpreter.parsing.models.Integer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    static List<Token> lex(String text) {
        List<Token> result = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '+' -> result.add(new Token(Type.PLUS, "+"));
                case '-' -> result.add(new Token(Type.MINUS, "-"));
                case '(' -> result.add(new Token(Type.LPAREN, "("));
                case ')' -> result.add(new Token(Type.RPAREN, ")"));
                default -> {
                    StringBuilder sb = new StringBuilder(String.valueOf(text.charAt(i)));
                    for (int j = i + 1; j < text.length(); ++j) {
                        if (Character.isDigit(text.charAt(j))){
                            sb.append(text.charAt(j));
                            i++;
                        }
                        else {
                            result.add(new Token(
                                    Type.INTEGER,
                                    sb.toString()
                            ));
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
    static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();

        boolean haveLHS = false;

        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            switch (token.type) {
                case INTEGER -> {
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if (!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    } else {
                        result.right = integer;
                    }
                }
                case PLUS -> result.type = BinaryOperation.Type.ADDITION;
                case MINUS -> result.type = BinaryOperation.Type.SUBTRACTION;
                case LPAREN -> {
                    int j = i;
                    for (; j < tokens.size(); ++j) {
                        if (tokens.get(j).type == Type.RPAREN) {
                            break;
                        }
                    }
                    List<Token> subexpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpression);
                    if (!haveLHS) {
                        result.left = element;
                        haveLHS = true;
                    } else {
                        result.right = element;
                    }
                    i = j;
                }
            }
        }

        return result;
    }
    public static void main( String[] args )
    {
        String input = "(13+5)-(1+1)";

        Element tokens = parse(
                lex(input)
        );

        System.out.println(input + " = " + tokens.eval());
    }

    /*
        https://www.baeldung.com/java-interpreter-pattern
     */
}
