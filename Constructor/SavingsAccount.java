// SavingsAccount.java
// Demonstrates access to public and protected members
public class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder);
    }
}
