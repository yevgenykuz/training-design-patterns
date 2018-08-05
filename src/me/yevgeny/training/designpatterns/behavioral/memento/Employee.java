package me.yevgeny.training.designpatterns.behavioral.memento;

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
        return new EmployeeMemento(name, phone);
    }

    /** We revert a previous Employee state from a previously saved EmployeeMemento object */
    public void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }

    /**
     * Gets the name
     *
     * @return value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     *
     * @param name
     *         the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address
     *
     * @return value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address
     *
     * @param address
     *         the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the phone
     *
     * @return value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone
     *
     * @param phone
     *         the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " : " + phone;
    }
}
