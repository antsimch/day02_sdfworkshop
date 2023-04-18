package sg.edu.nus.iss;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class BankAccount {

    private final String accountHolderName;
    private final String accountNumber;
    private float accountBalance;
    private LinkedList<String> transactions;
    private boolean accountClosed = false;
    private LocalDate accountCreationDate;
    private LocalDate accountClosingDate;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        int generateAccountNumber = (int) Math.random();
        this.accountNumber = "000" + generateAccountNumber;
        this.transactions = new LinkedList<>();
        this.accountCreationDate = LocalDate.now();
    }

    public BankAccount(String accountHolderName, float accountBalance) {
        this.accountHolderName = accountHolderName;
        int generateAccountNumber = (int) Math.random();
        this.accountNumber = "000" + generateAccountNumber;
        this.accountBalance = accountBalance;
        this.transactions = new LinkedList<>();
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

    public LinkedList<String> getTransactions() {
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
 
    public void setAccountClosingDate(LocalDate accountClosingDate) {
        this.accountClosingDate = accountClosingDate;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
        setAccountClosingDate(LocalDate.now());
    }

    @Override
    public String toString() {
        return "BankAccount [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
                + ", accountBalance=" + accountBalance + ", accountClosed=" + accountClosed + ", accountCreationDate="
                + accountCreationDate + ", accountClosingDate=" + accountClosingDate + "]";
    }

    public void deposit(float amountToDeposit) {
        if (amountToDeposit > 0) {
            float balanceAfterDeposit = getAccountBalance();
            balanceAfterDeposit += amountToDeposit;
            setAccountBalance(balanceAfterDeposit);
            transactions.add("deposit " + amountToDeposit + " to " + accountNumber + " at " + LocalDateTime.now());
            System.out.println(transactions.getLast());
        } else {
            throw new IllegalArgumentException("Deposits only accepts positive amount");
        }
    }

    public void withdraw(float amountToWithdraw) {
        if ((amountToWithdraw > 0) && (amountToWithdraw <= getAccountBalance())) {
            float balanceAfterWithdraw = getAccountBalance();
            balanceAfterWithdraw += amountToWithdraw;
            setAccountBalance(balanceAfterWithdraw);
            transactions.add("withdraw " + amountToWithdraw + " to " + accountNumber + " at " + LocalDateTime.now());
            System.out.println(transactions.getLast());
        } else {
            throw new IllegalArgumentException("Withdraws only accepts positive amount");
        }
    }
}
