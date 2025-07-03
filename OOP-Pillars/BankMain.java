import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "John Doe", 5000));
        accounts.add(new CurrentAccount("CUR456", "Jane Smith", 20000));

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                System.out.println("Loan Eligible: " + ((Loanable)acc).calculateLoanEligibility());
                ((Loanable)acc).applyForLoan(10000);
            }
            System.out.println("---");
        }
    }
}
