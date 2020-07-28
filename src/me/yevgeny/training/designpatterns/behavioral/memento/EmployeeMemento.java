package me.yevgeny.training.designpatterns.behavioral.memento;

/**
 * The memento. It contains data that represents state of an Employee object.
 * <p>
 * We can use this memento to revert the state of the original Employee object.
 *
 * @author Yevgeny Kuznetsov
 * @see Employee
 */
public class EmployeeMemento {

    private final String name;
    private final String address;
    private final String phone;

    public EmployeeMemento(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
