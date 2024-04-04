package main.problem_solving.intermediate.exercises.inheritance;

public class Account {

    private final String accountHolderName;
    private final String accountNumber;
    private int balance;

    public Account(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

}
