package main.problem_solving.intermediate.exercises.e02_inheritance;


public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public CheckingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        // Only allow the withdraw if the balance isn't going to -$100 or below
        if (getBalance() - amountToWithdraw > -100) {
            // Withdraw the $$
            super.withdraw(amountToWithdraw);
            // If the balance dips below 0, assess $10 charge
            if (getBalance() < 0) {
                super.withdraw(10);
            }
        }
        return getBalance();
    }
}
