package udemy.section6.constructors;

public class Main {

    public static void main(String[] args) {

        BankAccount peterAccount = new BankAccount();
        peterAccount.setBalance(100);
        peterAccount.deposit(50);
        System.out.println(peterAccount.getBalance());
        peterAccount.withdrawal(455);
        System.out.println(peterAccount.getBalance());
    }
}
