package com.yevgenyk.training.designpatterns.behavioral.interpreter;

/**
 * This represents an expression the interpreter understands.
 *
 * @author Yevgeny Kuznetsov
 */
public interface Expression {

    boolean interpret(String context);
}
