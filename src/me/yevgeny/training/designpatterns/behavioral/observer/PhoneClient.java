package me.yevgeny.training.designpatterns.behavioral.observer;

/**
 * This is a concrete implementation of an Observer.
 * <p>
 * It registers itself as an observer of a given subject on instantiation.
 * <p>
 * It changes the state of the observer subject - which is notified to all observers.
 *
 * @author Yevgeny Kuznetsov
 */
public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState("Sent from phone: " + message);
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }
}
