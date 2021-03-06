package com.yevgenyk.training.designpatterns.behavioral.memento;

/**
 * @author Yevgeny Kuznetsov
 */
public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();

        employee.setName("Mike White");
        employee.setAddress("123 Main Street");
        employee.setPhone("555-1234");
        System.out.println("Employee before save:\n" + employee);

        caretaker.save(employee);
        employee.setPhone("444-9876");
        caretaker.save(employee);
        System.out.println("Employee after changed phone number and saved:\n" + employee);

        employee.setPhone("111-1337"); // We do not save this using the caretaker.
        System.out.println("Employee was changed, but a mistake was made:\n" + employee);

        caretaker.revert(employee);
        System.out.println("Employee was reverted to previous save point:\n" + employee);

        caretaker.revert(employee);
        System.out.println("Employee reverted again to original:\n" + employee);
    }
}
