import java.util.ArrayList;
import java.util.List;

// Represents a bank customer
public class Customer {
    private String customerId;
    private String firstName;
    private String address;
    private String employmentInfo;
    private List<Account> accounts;

    public Customer(String customerId, String firstName, String address, String employmentInfo) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.address = address;
        this.employmentInfo = employmentInfo;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmploymentInfo() {
        return employmentInfo;
    }
}
