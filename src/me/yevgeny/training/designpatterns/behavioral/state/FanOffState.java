package me.yevgeny.training.designpatterns.behavioral.state;

/**
 * This is a concrete state.
 * <p>
 * In our case, handling the request causes the objects state to change. Therefore, we hold a reference to the object
 * and update its state in the handleRequest method.
 * <p>
 * The next state is FanLowState.
 *
 * @author Yevgeny Kuznetsov
 */
public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low...");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
