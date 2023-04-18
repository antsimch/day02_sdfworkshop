package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount bankAccount1 = new BankAccount("Tan");

        BankAccount bankAccount2 = new BankAccount("Lee", 2_000.00F);

        System.out.println(bankAccount1.getAccountHolderName());
        System.out.println(bankAccount1.getAccountNumber());
        bankAccount1.setAccountBalance(1_000.00F);
        
        System.out.println("Balance before withdraw: "+ bankAccount1.getAccountBalance());
        bankAccount1.withdraw(800.00F);
        // bankAccount1.withdraw(3000.00F);
        // bankAccount1.withdraw(-200.00F);
        System.out.println("Balance after withdraw: "+ bankAccount1.getAccountBalance());

        System.out.println("Balance before deposit: "+ bankAccount1.getAccountBalance());
        bankAccount1.deposit(50.00F);
        System.out.println("Balance after deposit: "+ bankAccount1.getAccountBalance());     
        
        System.out.println(bankAccount1.getTransactions());

        System.out.println(bankAccount2.getAccountHolderName());
        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(bankAccount2.getAccountCreationDate());


        FixedDepositAccount bankAccount3 = new FixedDepositAccount("Lim", 1_000.00F);
        FixedDepositAccount bankAccount4 = new FixedDepositAccount("Tay", 3_000.00F, 4);
        FixedDepositAccount bankAccount5 = new FixedDepositAccount("Ong", 5_000.00F, 5, 12);


        System.out.println(bankAccount3.getAccountHolderName());
        System.out.println(bankAccount3.getAccountNumber());
        System.out.println(bankAccount3.getAccountBalance());

        System.out.println("Interest before: " + bankAccount3.getInterest() + "%");
        bankAccount3.setInterest(3.5F);
        // bankAccount3.setInterest(4.0F);
        System.out.println("Interest after: " + bankAccount3.getInterest() + "%");

        System.out.println("Duration before: " + bankAccount3.getDurationInMonths() + " months");
        bankAccount3.setDurationInMonths(9);
        // bankAccount3.setDurationInMonths(12);
        System.out.println("Duration after: " + bankAccount3.getDurationInMonths() + " months");

        System.out.println(bankAccount4.getAccountHolderName());
        System.out.println(bankAccount4.getAccountNumber());
        System.out.println(bankAccount4.isBalanceSet());

        System.out.println("Balance before withdraw: "+ bankAccount4.getAccountBalance());
        bankAccount4.withdraw(500.00F);
        System.out.println("Balance after withdraw: "+ bankAccount4.getAccountBalance());
        
        System.out.println("Balance before deposit: "+ bankAccount4.getAccountBalance());
        bankAccount4.deposit(200.00F);
        System.out.println("Balance after deposit: "+ bankAccount4.getAccountBalance());

        System.out.println(bankAccount5.getAccountHolderName());
        System.out.println(bankAccount5.getAccountNumber());
        System.out.println("Fixed Deposit Account Balance: " + bankAccount5.getFixedDepositBalance());
    }
}
