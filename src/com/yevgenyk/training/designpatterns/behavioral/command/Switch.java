package com.yevgenyk.training.designpatterns.behavioral.command;

/**
 * This is the invoker - it will invoke the command.
 * <p>
 * It's not exposed to the command result or the objects the command affects (- the receiver).
 *
 * @author Yevgeny Kuznetsov
 */
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
