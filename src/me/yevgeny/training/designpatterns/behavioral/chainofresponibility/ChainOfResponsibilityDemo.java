package me.yevgeny.training.designpatterns.behavioral.chainofresponibility;

/**
 * @author Yevgeny Kuznetsov
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        // here we create the chain - we assign successors to handlers:
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        // All requests will be "thrown" at the first link in the chain - the director.

        // The director can handle this request, it will not pass it along:
        Request request = new Request(RequestType.CONFERENCE, 100);
        director.handleRequest(request);

        // The director can't handle this request, it will pass it along to the vp behind the scenes:
        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        // The director can't handle this request, it will pass it along to the vp that will pass it to the ceo
        // behind the scenes:
        request = new Request(RequestType.PURCHASE, 5000);
        director.handleRequest(request);

    }
}
