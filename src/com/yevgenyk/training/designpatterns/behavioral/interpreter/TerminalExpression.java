package com.yevgenyk.training.designpatterns.behavioral.interpreter;

import java.util.StringTokenizer;

/**
 * This represents the expression that compares a word that's defined in the interpreterTree rule set (grammar) to the
 * data - one word at a time (using a stringTokenizer).
 * <p>
 * It is a terminal expression - a final decision is made here.
 *
 * @author Yevgeny Kuznetsov
 */
public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer stringTokenizer = new StringTokenizer(context);
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.equals(data)) {
                return true;
            }
        }

        return false;
    }
}
