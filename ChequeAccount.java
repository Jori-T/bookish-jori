// Cheque account for business clients
public class ChequeAccount extends Account {
    private String companyName;
    private String companyAddress;

    public ChequeAccount(String accountNumber, double initialBalance, String bankCode, Customer owner,
                         String companyName, String companyAddress) {
        super(accountNumber, initialBalance, bankCode, owner);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    @Override
    public boolean withdraw(double amount) {
        // Customize withdrawal logic if needed
        return super.withdraw(amount);
    }
}
