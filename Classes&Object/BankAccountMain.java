// BankAccountMain.java
// Test class for BankAccount

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Priya", "1234567890", 5000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(7000); // Should show insufficient balance
        account.displayBalance();
    }
}
