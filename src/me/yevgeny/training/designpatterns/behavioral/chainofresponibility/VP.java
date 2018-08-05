package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * This is a concrete handler. It can perform operations on specific requests.
 * <p>
 * It's the second link in the chain, and can pass requests it can't handle to its successor.
 *
 * @author Yevgeny Kuznetsov
 * @see CEO (successor)
 */
public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("A VP can approve purchases below 1500 - no need to pass request to the successor");
            } else {
                // pass the request to the successor:
                successor.handleRequest(request);
            }
        }
    }
}

