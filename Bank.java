import java.util.ArrayList;
import java.util.List;

// Represents the bank entity
public class Bank {
    private String name;
    private String bankCode;
    private String address;
    private List<Account> accounts;

    public Bank(String name, String bankCode, String address) {
        this.name = name;
        this.bankCode = bankCode;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
