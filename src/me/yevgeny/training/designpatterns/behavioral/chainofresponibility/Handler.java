package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * This is the abstract handler class. It handles requests from the client.
 * <p>
 * All concrete handlers will implement handleRequest() in their own way.
 *
 *
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * Sets the successor
     *
     * @param successor
     *         the successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
