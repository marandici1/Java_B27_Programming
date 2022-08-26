package day38_encapsulation.bank;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    // no set method so the value can't be changed
}
