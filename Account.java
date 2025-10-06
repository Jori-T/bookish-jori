// Abstract base class for all account types
public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String bankCode;
    protected Customer owner;

    public Account(String accountNumber, double initialBalance, String bankCode, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bankCode = bankCode;
        this.owner = owner;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public Customer getOwner() {
        return owner;
    }
}
