package me.yevgeny.training.designpatterns.structural.adapter;

/**
 * This class represent legacy code and cannot be changed.
 * <p>
 * An adapter design pattern will applied to work with this class just with the current EmployeeClient.
 *
 * @author Yevgeny Kuznetsov
 * @see EmployeeAdapterLdap
 */
public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeLdap{" + "cn='" + cn + '\'' + ", surname='" + surname + '\'' + ", givenName='" + givenName +
                '\'' + ", mail='" + mail + '\'' + '}';
    }
}
