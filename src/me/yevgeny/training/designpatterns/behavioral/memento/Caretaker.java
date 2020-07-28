package me.yevgeny.training.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * This is the caretaker. It holds copies of memento objects, and handles as a revision history for Employee objects.
 * <p>
 * Once a memento is saved, it can be retrieved to revert a state of the Employee object the memento represents.
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeMemento
 */
public class Caretaker {

    private final Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
