package me.yevgeny.training.designpatterns.behavioral.observer;

/**
 * This is another concrete implementation of an Observer.
 * <p>
 * It registers itself as an observer of a given subject on instantiation.
 * <p>
 * It changes the state of the observer subject - which is notified to all observers.
 *
 * @author Yevgeny Kuznetsov
 */
public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}
