package classesAndObjects;

public class BankAccount {

    private final String name;
    private final String accountNumber;
    private final String ifscCode;

    private double balance;

    private static int counter;

    public BankAccount(String name, String accountNumber, String ifscCode, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.balance = balance;
        increaseCounter();
    }

    private static void increaseCounter() {
        counter++;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Awkaat mein rho");
            return false;
        } else if (amount < 0) {
            System.out.println("Bhaiya peeye ho kaa?");
            return false;
        }

        this.balance = this.balance - amount;
        System.out.println("Amount of " + amount + " withdrawn.");
        System.out.println("Remaining balance = " + this.balance);
        return true;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("Chutiya gye kaa?");
            return false;
        }

        this.balance = this.balance + amount;
        System.out.println("Amount of " + amount + " deposited.");
        System.out.println("Remaining balance = " + this.balance);
        return true;
    }

    public void showDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Account name : " + this.name);
        System.out.println("Account number : " + this.accountNumber);
        System.out.println("Account IFSC Code : " + this.ifscCode);
        System.out.println("Account balance : " + this.balance);
        System.out.println("----------------------------------------");
    }

    public static void showTotalAccounts() {

        System.out.println(counter + " have been created so far.");
    }
}
