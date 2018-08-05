package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * @author Yevgeny Kuznetsov
 */
public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    /**
     * Gets the requestType
     *
     * @return value of requestType
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Gets the amount
     *
     * @return value of amount
     */
    public double getAmount() {
        return amount;
    }
}
