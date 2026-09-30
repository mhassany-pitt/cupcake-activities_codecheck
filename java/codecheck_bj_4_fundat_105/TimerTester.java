public class TimerTester
{
   public static void main(String[] args)
   {
      Timer t = new Timer();
      t.add(40); // 40 minutes
      t.add(50); // another 50 minutes
      System.out.println("Total: " + t.getTotal()); 
      System.out.println("Expected: 1:30");
   }
}
