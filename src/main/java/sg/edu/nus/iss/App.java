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
        bankAccount1.withdraw(800.00F);
        bankAccount1.deposit(50.00F);
        bankAccount1.withdraw(3000.00F);
        System.out.println(bankAccount1.getTransactions());

        System.out.println(bankAccount2.getAccountHolderName());
        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(bankAccount2.getAccountCreationDate());



    }
}
