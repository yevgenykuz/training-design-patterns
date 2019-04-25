package me.yevgeny.training.designpatterns.structural.adapter;

import java.util.StringTokenizer;

/**
 * This class represent legacy code and cannot be changed, but this time <b>does not</b> implement the Employee
 * interface.
 * <p> An adapter design pattern will applied to work with this class just with the current EmployeeClient.
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeAdapterCSV
 */
public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
