public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount(1000);
      account1.withdraw(100);
      System.out.println(account1.getBalance());
      System.out.println("Expected: 899");

      BankAccount account2 = new BankAccount();
      account2.deposit(1000);
      account2.withdraw(100);
      account2.withdraw(100);
      System.out.println("Balance: " + account2.getBalance());
      System.out.println("Expected: 798");      
   }
}
