package com.yevgenyk.training.designpatterns.structural.proxy;

/**
 * This is an stub implementation of a TwitterService.
 *
 * @author Yevgeny Kuznetsov
 * @see TwitterService
 */
public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "A timeline example";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("This shouldn't appear after security is implemented in the proxy:\n" + message);
    }
}
