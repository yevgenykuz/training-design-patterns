package me.yevgeny.training.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the mediator. A colleague (Command) will use this to perform actions.
 *
 * @author Yevgeny Kuznetsov
 */
public class Mediator {

    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for (Light light : lights) {
            if (!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
