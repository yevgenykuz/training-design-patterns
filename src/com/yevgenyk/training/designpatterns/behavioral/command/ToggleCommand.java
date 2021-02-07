package com.yevgenyk.training.designpatterns.behavioral.command;

/**
 * This is a concrete command. We store a reference to the command receiver here (the light object), and perform a
 * command on it.
 *
 * @author Yevgeny Kuznetsov
 */
public class ToggleCommand implements Command {

    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
