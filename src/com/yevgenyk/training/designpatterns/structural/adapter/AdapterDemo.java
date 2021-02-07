package com.yevgenyk.training.designpatterns.structural.adapter;

import java.util.List;

/**
 * @author Yevgeny Kuznetsov
 */
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
