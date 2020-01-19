package nl.home;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account() {
        // passes other constructor into empty/default constructor
        this("00000",0,"Default name","Default email","Default phone number");
        System.out.println("Default constructor accessed.");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 0.0,customerName,customerEmail,phoneNumber);
    }



    public String getAccountNumber() {
        return number;
    }

    public void setAccountNumber(String accountNumber) {
        this.number = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        this.balance = Math.round(this.balance*100)/100d; // Round off to 2 decimals
        depositAmount = Math.round(depositAmount*100)/100d;
        System.out.println("Deposited $" + depositAmount + ". New balance: $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > this.balance) {
            System.out.println("Insufficient funds to withdraw $" + withdrawAmount + ". Current balance: $" + this.balance);
        }
        else {
            this.balance -= withdrawAmount;
            this.balance = Math.round(this.balance*100)/100d; // Round off to 2 decimals
            withdrawAmount = Math.round(withdrawAmount*100)/100d;
            System.out.println("Withdrew $" + withdrawAmount + ". New balance: $" + this.balance);
        }
    }
}
