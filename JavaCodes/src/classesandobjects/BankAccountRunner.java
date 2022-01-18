package classesandobjects;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount.showTotalAccounts();
        BankAccount b1 = new BankAccount("kanishk", "123", "456", 10000.00);
        b1.showTotalAccounts();
        BankAccount b2 = new BankAccount("karan", "124", "456", 100000.00);
        BankAccount.showTotalAccounts();
        BankAccount b3 = new BankAccount("kunal", "125", "476", 100.00);
        BankAccount.showTotalAccounts();


        b1.showDetails();
        b2.showDetails();
        b3.showDetails();

        b1.deposit(5000);
        b2.withdraw(8000);
        b3.deposit(1200);

        b1.showDetails();
        b2.showDetails();
        b3.showDetails();

    }
}
