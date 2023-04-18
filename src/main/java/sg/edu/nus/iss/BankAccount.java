package sg.edu.nus.iss;

import java.util.List;

public class BankAccount {

    private final String accountHolderName;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean accountClosed = false;
    private String accountCreatingDate;
    private String accountClosingDate;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        double generateAccountNumber = Math.random();
        this.accountNumber = "" + generateAccountNumber;
    }

    public BankAccount(String accountHolderName, float accountBalance) {
        this.accountHolderName = accountHolderName;
        double generateAccountNumber = Math.random();
        this.accountNumber = "" + generateAccountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public boolean isAccountClosed() {
        return accountClosed;
    }

    public String getAccountCreatingDate() {
        return accountCreatingDate;
    }

    public String getAccountClosingDate() {
        return accountClosingDate;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
    }

    public void setAccountCreatingDate(String accountCreatingDate) {
        this.accountCreatingDate = accountCreatingDate;
    }

    public void setAccountClosingDate(String accountClosingDate) {
        this.accountClosingDate = accountClosingDate;
    }
         
}
