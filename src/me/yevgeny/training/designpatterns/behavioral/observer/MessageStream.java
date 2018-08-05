package me.yevgeny.training.designpatterns.behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This a concrete implementation of a subject. It contains concrete implementation for subject state.
 *
 * @author Yevgeny Kuznetsov
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
