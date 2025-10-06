// Savings account with interest calculation
public class SavingsAccount extends Account {
    public static final double INTEREST_RATE = 0.0065;

    public SavingsAccount(String accountNumber, double initialBalance, String bankCode, Customer owner) {
        super(accountNumber, initialBalance, bankCode, owner);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
