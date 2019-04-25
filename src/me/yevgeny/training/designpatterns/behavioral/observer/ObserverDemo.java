package me.yevgeny.training.designpatterns.behavioral.observer;

/**
 * @author Yevgeny Kuznetsov
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("A message");
        tabletClient.addMessage("Another message");
    }
}
