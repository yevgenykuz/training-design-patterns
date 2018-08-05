package me.yevgeny.training.designpatterns.behavioral.state;

/**
 * This represents the state abstract. Concrete states must implement concrete request handling.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class State {
    public void handleRequest() {
        System.out.println("This is the default implementation - shouldn't get here");
    }
}
