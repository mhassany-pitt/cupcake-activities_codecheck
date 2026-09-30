public class AutoTester
{
   public static void main(String[] args)
   {
      Vehicle auto1 = new Auto("1234567890", "A141G3");
      Vehicle auto2 = new Auto("1234567890", "5ZSN090");
      Vehicle auto3 = new Auto("14916253649", "A141G3");
      Vehicle auto4 = new Auto("1234567890", "A141G3");
      System.out.println(auto1.equals(auto1));
      System.out.println("Expected: true");
      System.out.println(auto1.equals(auto2));
      System.out.println("Expected: false");
      System.out.println(auto1.equals(auto3));
      System.out.println("Expected: false");
      System.out.println(auto1.equals(auto4));
      System.out.println("Expected: true");
   }
}
