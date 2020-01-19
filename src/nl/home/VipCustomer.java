package nl.home;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name","default@email.com",0);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email) {
        this(name,email,0);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
