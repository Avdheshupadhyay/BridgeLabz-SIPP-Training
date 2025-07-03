public class SavingsAccount extends BankAccount implements Loanable {
    private boolean hasLoan;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.hasLoan = false;
    }

    @Override
    public double calculateInterest() {
        // 4% interest
        return getBalance() * 0.04;
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
        return !hasLoan && getBalance() > 1000;
    }
}
