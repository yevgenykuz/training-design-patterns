package com.yevgenyk.training.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yevgeny Kuznetsov
 */
public class CommandDemo {

    public static void main(String[] args) {
        // this are receivers - they receive the command result:
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        // this is the invoker - it will invoke the command:
        Switch lightSwitch = new Switch();

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command toggleCommand = new ToggleCommand(bedroomLight);
        Command allLightsCommandCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(allLightsCommandCommand);
    }
}
