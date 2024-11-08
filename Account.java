package guviTask6;

public class Account {
    private String accountNumber;
    private double balance;
    public Account() {
        this.accountNumber = "10100";
        this.balance = 79.0;
    }
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public double checkBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
