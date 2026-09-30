public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount();
      account1.deposit(100);
      System.out.println("Transactions: " + account1.getTransactionCount());
      System.out.println("Expected: 1");

      BankAccount account2 = new BankAccount(1000);
      account2.withdraw(100);
      System.out.println("Transactions: " + account2.getTransactionCount());
      System.out.println("Expected: 1");

      BankAccount account3 = new BankAccount();
      account3.deposit(1000);
      account3.withdraw(100);
      account3.deposit(1000);
      account3.withdraw(100);
      account3.withdraw(100);
      System.out.println("Transactions: " + account3.getTransactionCount());
      System.out.println("Expected: 5");      
   }
}
