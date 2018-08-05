package me.yevgeny.training.designpatterns.structural.proxy;

/**
 * This a interface that we wish to secure by implementing a proxy between it and the actual implementation class -
 * TwitterServiceStub.
 *
 * @author Yevgeny Kuznetsov
 * @see SecurityProxy
 * @see TwitterServiceStub
 */
public interface TwitterService {
    String getTimeline(String screenName);

    void postToTimeline(String screenName, String message);
}
