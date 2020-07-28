package me.yevgeny.training.designpatterns.structural.adapter;

/**
 * This adapter allows EmployeeClient to use legacy "EmployeeCSV" objects.
 * <p>
 * Here we actually change the type of one of the values (id) from int to String.
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeCSV
 */
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
