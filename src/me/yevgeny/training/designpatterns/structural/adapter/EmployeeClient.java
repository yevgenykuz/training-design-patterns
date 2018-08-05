package me.yevgeny.training.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yevgeny Kuznetsov
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1", "Mike", "White", "mike@white.com");
        employees.add(employeeFromDB);

        // A legacy "EmployeeLdap" object:
        EmployeeLdap employeeFromLdap = new EmployeeLdap("2", "Bill", "Levi", "bill@levi.com");

        // Here we use the adapter with the legacy "EmployeeLdap" object. A new adapter is needed every time:
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        // Here is another legacy "EmployeeFromCSV" object:
        EmployeeCSV employeeFromCSV = new EmployeeCSV("3,Bob,Crown,bob@crown.com");

        // Here we use the adapter with the legacy "EmployeeFromCSV" object. A new adapter is needed every time:
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
