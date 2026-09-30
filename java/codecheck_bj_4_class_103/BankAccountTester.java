public class BankAccountTester   
{
   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount();
      System.out.println("Balance: " + account1.getBalance());
      System.out.println("Expected: 10");
      BankAccount account2 = new BankAccount(1000);
      System.out.println("Balance: " + account2.getBalance());
      System.out.println("Expected: 1010");      
   }
}
