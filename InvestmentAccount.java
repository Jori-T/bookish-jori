// Investment account with higher interest rate
public class InvestmentAccount extends Account {
    public static final double INTEREST_RATE = 0.05;

    public InvestmentAccount(String accountNumber, double initialBalance, String bankCode, Customer owner) {
        super(accountNumber, initialBalance, bankCode, owner);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
