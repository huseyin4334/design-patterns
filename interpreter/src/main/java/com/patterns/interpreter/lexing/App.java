package com.patterns.interpreter.lexing;

import com.patterns.interpreter.lexing.models.Token;
import com.patterns.interpreter.lexing.models.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {

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
    public static void main( String[] args )
    {
        String input = "(13+5)-(12+12)";

        List<Token> tokens = lex(input);

        System.out.println(
                tokens.stream().map(Token::toString).collect(Collectors.joining("\t"))
        );
    }
}
