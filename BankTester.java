// Tester class to simulate banking operations
public class BankTester {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Elite Bank", "EB001", "456 Finance Road");

        // Create a customer
        Customer customer1 = new Customer("C001", "Tlamelo", "Gaborone", "Software Developer");

        // Open a Savings Account
        SavingsAccount savings = new SavingsAccount("SA001", 1000.0, bank.getBankCode(), customer1);
        customer1.openAccount(savings);
        bank.addAccount(savings);

        // Open an Investment Account
        InvestmentAccount investment = new InvestmentAccount("IA001", 5000.0, bank.getBankCode(), customer1);
        customer1.openAccount(investment);
        bank.addAccount(investment);

        // Open a Cheque Account
        ChequeAccount cheque = new ChequeAccount("CA001", 2000.0, bank.getBankCode(), customer1,
                                                 "TechCorp", "123 Innovation Ave");
        customer1.openAccount(cheque);
        bank.addAccount(cheque);

        // Perform transactions
        savings.deposit(500);
        cheque.withdraw(300);
        investment.deposit(1000);

        // Display balances and interest
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println("Investment Account Balance: " + investment.getBalance());
        System.out.println("Investment Interest: " + investment.calculateInterest());

        System.out.println("Cheque Account Balance: " + cheque.getBalance());

        // List all accounts for the customer
        System.out.println("\nAccounts for " + customer1.getFirstName() + ":");
        for (Account acc : customer1.getAccounts()) {
            System.out.println("- " + acc.getClass().getSimpleName() + " [" + acc.getAccountNumber() + "] Balance: " + acc.getBalance());
        }
    }
}
