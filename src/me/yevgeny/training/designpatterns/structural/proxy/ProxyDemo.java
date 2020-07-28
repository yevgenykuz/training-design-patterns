package me.yevgeny.training.designpatterns.structural.proxy;

/**
 * @author Yevgeny Kuznetsov
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // The TwitterService is wrapped with a SecurityProxy. All method calls wee go through the SecurityProxy:
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("test"));

        // This should fail after security is implemented in the proxy:
        service.postToTimeline("test", "A rouge message");
    }
}
