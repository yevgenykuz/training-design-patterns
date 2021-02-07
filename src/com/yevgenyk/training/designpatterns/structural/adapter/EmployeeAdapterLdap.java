package com.yevgenyk.training.designpatterns.structural.adapter;

/**
 * This adapter allows EmployeeClient to use legacy "EmployeeLdap" objects.
 * <p>
 * <u>Regarding the "toString()" method:</u>
 * <ul>
 * <li> Some say that adding a "toString()" method here will make it becoming a decorator design pattern, since we
 * <b>change the original toString() representation of the object</b>. The "purest" adapter design pattern follower
 * will not add a "toString()" method </li>
 * <li> Others, will say that adding a "toString()" method is ok, since it only changes representation </li>
 * </ul>
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeLdap
 */
public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
