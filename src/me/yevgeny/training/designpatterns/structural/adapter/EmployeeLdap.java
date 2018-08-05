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

    /**
     * Gets the cn
     *
     * @return value of cn
     */
    public String getCn() {
        return cn;
    }

    /**
     * Gets the surname
     *
     * @return value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the givenName
     *
     * @return value of givenName
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Gets the mail
     *
     * @return value of mail
     */
    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeLdap{" + "cn='" + cn + '\'' + ", surname='" + surname + '\'' + ", givenName='" + givenName +
                '\'' + ", mail='" + mail + '\'' + '}';
    }
}
