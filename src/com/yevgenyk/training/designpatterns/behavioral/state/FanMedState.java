package com.yevgenyk.training.designpatterns.behavioral.state;

/**
 * This is a concrete state.
 * <p>
 * In our case, handling the request causes the objects state to change. Therefore, we hold a reference to the object
 * and update its state in the handleRequest method.
 * <p>
 * The next state is FanHighState.
 *
 * @author Yevgeny Kuznetsov
 */
public class FanMedState extends State {

    private final Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high...");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is set to med.";
    }
}
