package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    
    private float interest = 3.0F;
    private int durationInMonths = 6;
    private boolean balanceSet = false;
    private boolean interestChanged = false;
    private boolean durationInMonthsChanged = false;

    public FixedDepositAccount(String accountHolderName, float accountBalance) {
        super(accountHolderName, accountBalance);
        setBalanceSet(true);
    }

    public FixedDepositAccount(String accountHolderName, float accountBalance, float interest) {
        super(accountHolderName, accountBalance);
        this.interest = interest;
        setBalanceSet(true);
    }

    public FixedDepositAccount(String accountHolderName, float accountBalance, float interest, int durationInMonths) {
        super(accountHolderName, accountBalance);
        this.interest = interest;
        this.durationInMonths = durationInMonths;
        setBalanceSet(true);
    }

    public float getInterest() {
        return interest;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public boolean isBalanceSet() {
        return balanceSet;
    }

    public boolean isInterestChanged() {
        return interestChanged;
    }

    public boolean isDurationInMonthsChanged() {
        return durationInMonthsChanged;
    }

    public float getFixedDepositBalance() {
       return (getAccountBalance() * (1 + (interest / 100)));
    }

    public void setInterest(float interest) {
        if (interest > 0) {
            if (interestChanged == false){
                this.interest = interest;
                setInterestChanged(true);
            } else {
                throw new IllegalArgumentException("Interest has already been changed once");
            }
        } else {
            throw new IllegalArgumentException("Interest cannot be less than zero");
        }
    }

    public void setDurationInMonths(int durationInMonths) {
        if (durationInMonths > 0) {
            if (durationInMonthsChanged == false) {
                this.durationInMonths = durationInMonths;
                setDurationInMonthsChanged(true);
            } else {
                throw new IllegalArgumentException("Duration has already been changed once");
            }
        } else {
            throw new IllegalArgumentException("Interest cannot be less than zero");
        }
    }

    public void setBalanceSet(boolean balanceSet) {
        this.balanceSet = balanceSet;
    }

    public void setInterestChanged(boolean interestChanged) {
        this.interestChanged = interestChanged;
    }

    public void setDurationInMonthsChanged(boolean durationInMonthsChanged) {
            this.durationInMonthsChanged = durationInMonthsChanged;
    } 

    @Override
    public void deposit(float amountToDeposit) {
        System.out.println("You cannot deposit into Fixed Deposit Account");
    }

    @Override
    public void withdraw(float amountToWithdraw) {
        System.out.println("You cannot withdraw from Fixed Deposit Account");
    }
}
