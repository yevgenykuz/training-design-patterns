package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * This is a concrete handler. It can perform operations on specific requests.
 * <p>
 * It's the last link in the chain, and doesn't have a successor.
 *
 * @author Yevgeny Kuznetsov
 */
public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("A CEO can approve anything - there is no successor");
    }
}
