package me.yevgeny.training.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * This is the class that is being observed.
 * <p>
 * Observers are attached to observe, and can be notified when events happen.
 * <p>
 * setState and getState methods are accessible from the observers. This allows observers to make changes to a subject -
 * which will be notified to all observers.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);

    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
