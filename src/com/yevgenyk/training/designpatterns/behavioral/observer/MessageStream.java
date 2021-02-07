package com.yevgenyk.training.designpatterns.behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This a concrete implementation of a subject. It contains concrete implementation for subject state.
 *
 * @author Yevgeny Kuznetsov
 */
public class MessageStream extends Subject {

    private final Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        System.out.println("[Observer sets observee state]");
        System.out.println(message);
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
