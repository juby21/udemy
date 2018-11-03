package udemy.section6.constructors;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public void deposit(double deposit){
        this.balance += deposit;
    }
    public void withdrawal(double withdrawal){
        if(withdrawal>this.balance){
            System.out.println("Insufficient funds on your account");
        }else {
             double currentBalance = getBalance() -withdrawal;
             setBalance(currentBalance);
        }

}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
