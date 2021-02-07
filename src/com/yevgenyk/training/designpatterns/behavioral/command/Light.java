package com.yevgenyk.training.designpatterns.behavioral.command;

/**
 * This is the receiver - it will receive the command result.
 * <p>
 * The command will be requested by the invoker (the Switch).
 *
 * @author Yevgeny Kuznetsov
 */
public class Light {

    /** We use this to save the state of a light. */
    private boolean isOn = false;

    /** We expose the state for commands to use */
    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    private void on() {
        System.out.println("Light switched on");
    }

    private void off() {
        System.out.println("Light switched off");
    }
}
