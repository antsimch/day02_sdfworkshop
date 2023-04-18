package sg.edu.nus.iss;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BankAccount {

    private final String accountHolderName;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean accountClosed = false;
    private LocalDate accountCreationDate;
    private LocalDate accountClosingDate;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        double generateAccountNumber = Math.random();
        this.accountNumber = "" + generateAccountNumber;
        this.accountCreationDate = LocalDate.now();
    }

    public BankAccount(String accountHolderName, float accountBalance) {
        this.accountHolderName = accountHolderName;
        double generateAccountNumber = Math.random();
        this.accountNumber = "" + generateAccountNumber;
        this.accountBalance = accountBalance;
        this.accountCreationDate = LocalDate.now();
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

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public LocalDate getAccountClosingDate() {
        return accountClosingDate;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
    }

    public void deposit(float amountToDeposit) {
        if (amountToDeposit > 0) {
            float balanceAfterDeposit = getAccountBalance();
            balanceAfterDeposit += amountToDeposit;
            setAccountBalance(balanceAfterDeposit);
            System.out.println("deposit " + amountToDeposit + " " + LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Deposits only accepts positive amount");
        }
    }

    public void withdraw(float amountToWithdraw) {
        if (amountToWithdraw > 0) {
            float balanceAfterWithdraw = getAccountBalance();
            balanceAfterWithdraw += amountToWithdraw;
            setAccountBalance(balanceAfterWithdraw);
            System.out.println("withdraw " + amountToWithdraw + " " + LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Withdraws only accepts positive amount");
        }
    }
}
