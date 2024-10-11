import java.util.HashMap;
import java.util.Map;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added for " + account.getAccountHolderName());
    }

    public void removeAccount(String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account " + accountNumber + " removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void depositMoney(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            System.out.println("List of all accounts:");
            for (Map.Entry<String, Account> entry : accounts.entrySet()) {
                Account account = entry.getValue();
                System.out.println("-------------------------------");
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Holder: " + account.getAccountHolderName());
                System.out.println("Balance: " + account.getBalance());
                System.out.println("-------------------------------");
            }
        }
    }
}