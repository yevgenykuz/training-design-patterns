package com.yevgenyk.training.designpatterns.behavioral.state;

/**
 * This is the object that has states. It holds all its possible states, and passes request handling to each state
 * class.
 * <p>
 * The state class itself is responsible to update this objects state.
 *
 * @author Yevgeny Kuznetsov
 */
public class Fan {

    private final State fanOffState;
    private final State fanLowState;
    private final State fanMedState;
    private final State fanHighState;

    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }
}
