package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * This is a concrete handler. It can perform operations on specific requests.
 * <p>
 * It's the first link in the chain, and can pass requests it can't handle to its successor.
 *
 * @author Yevgeny Kuznetsov
 * @see VP (successor)
 */
public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("A director can approve conferences - no need to pass request to the successor");
        } else {
            // pass the request to the successor:
            successor.handleRequest(request);
        }
    }
}
