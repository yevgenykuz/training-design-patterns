package com.yevgenyk.training.designpatterns.behavioral.memento;

/**
 * This is the originator. We want to create copies of this object to save it's state changes.
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeMemento
 */
public class Employee {

    private String name;
    private String address;
    private String phone;

    /** We save the current Employee state in an EmployeeMemento object */
    public EmployeeMemento save() {
        return new EmployeeMemento(name, address, phone);
    }

    /** We revert a previous Employee state from a previously saved EmployeeMemento object */
    public void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.address = employeeMemento.getAddress();
        this.phone = employeeMemento.getPhone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " : " + address + " [" + phone + "]";
    }
}
