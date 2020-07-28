package me.yevgeny.training.designpatterns.behavioral.state;

/**
 * @author Yevgeny Kuznetsov
 */
public class StateDemo {

    public static void main(String[] args) {
        // fan is initialized with the off state:
        Fan fan = new Fan();
        System.out.println(fan);

        // state changes to low:
        fan.pullChain();
        System.out.println(fan);

        // state changes to med:
        fan.pullChain();
        System.out.println(fan);

        // state changes to high:
        fan.pullChain();
        System.out.println(fan);

        // state changes back to off:
        fan.pullChain();
        System.out.println(fan);
    }
}
