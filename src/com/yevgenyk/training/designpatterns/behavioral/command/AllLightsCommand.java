package com.yevgenyk.training.designpatterns.behavioral.command;

import java.util.List;

/**
 * This is a concrete command. We store a reference to the command receiver here (the light objects), and perform a
 * command on it.
 *
 * @author Yevgeny Kuznetsov
 */
public class AllLightsCommand implements Command {

    /** We store lights receivers here to handle multiple objects with a single execution */
    private final List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    /** We use the command wrapper to evaluate the state of the receiver and turn the light off only if its on */
    @Override
    public void execute() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
