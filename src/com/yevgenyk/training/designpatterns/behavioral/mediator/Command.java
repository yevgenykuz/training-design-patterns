package com.yevgenyk.training.designpatterns.behavioral.mediator;

/**
 * This is the colleague that uses the mediator to perform actions.
 *
 * @author Yevgeny Kuznetsov
 */
public interface Command {

    void execute();
}
