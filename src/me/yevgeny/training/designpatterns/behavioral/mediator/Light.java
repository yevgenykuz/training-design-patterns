package me.yevgeny.training.designpatterns.behavioral.mediator;

/**
 * This is the receiver - the mediator will perform actions on this objects.
 *
 * @author Yevgeny Kuznetsov
 */
public class Light {

    /** We use this to save the state of a light. */
    private boolean isOn = false;

    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (!isOn) {
            on();
            isOn = true;
        } else {
            off();
            isOn = false;
        }
    }

    private void on() {
        System.out.println("Light switched on in " + location);
    }

    private void off() {
        System.out.println("Light switched off " + location);
    }
}
