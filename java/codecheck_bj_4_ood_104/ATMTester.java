import java.io.IOException;

public class ATMTester
{
   public static void main(String[] args) throws IOException
   {
      Bank bank = new Bank();
      bank.readCustomers("customers.txt");
      ATM atm = new ATM(bank);
      atm.setCustomerNumber(1);
      atm.selectCustomer(1234);
      atm.selectAccount(ATM.SAVINGS);
      atm.deposit(4000);
      atm.transfer(2000);
      System.out.println("Savings: " + atm.getBalance());
      System.out.println("Expected: 2000");
      atm.back();
      atm.selectAccount(ATM.CHECKING);      
      atm.transfer(500);
      System.out.println("Checking: " + atm.getBalance());
      System.out.println("Expected: 1500");
      atm.back();
      atm.selectAccount(ATM.SAVINGS);      
      System.out.println("Savings: " + atm.getBalance());
      System.out.println("Expected: 2500");
   }
}
