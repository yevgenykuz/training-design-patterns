package com.yevgenyk.training.designpatterns.behavioral.observer;

/**
 * This is the observer. It contains the subject it observes and an update() method that is called when the subject
 * notifies its observers.
 * <p>
 * It differs from the java.util.Observer implementation as it holds a reference to the subject being observed. This
 * allows observers to attach themselves to the subject as observers, and allows them to change the state of the
 * subject.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class Observer {

    protected Subject subject;

    abstract void update();
}
