public class CurrentAccount extends BankAccount implements Loanable {
    private boolean hasLoan;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.hasLoan = false;
    }

    @Override
    public double calculateInterest() {
        // No interest for current accounts
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount > 0 && !hasLoan) {
            System.out.println("Loan applied for: " + amount);
            hasLoan = true;
        } else {
            System.out.println("Loan application failed.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return !hasLoan && getBalance() > 5000;
    }
}
