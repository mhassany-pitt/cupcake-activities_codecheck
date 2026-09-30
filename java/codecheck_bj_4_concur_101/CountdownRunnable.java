/**
   A runnable that prints a countdown.
*/
public class CountdownRunnable implements Runnable
{
   /**
      Constructs the runnable object.
      @param startingValue the starting value of the countdown
      @param aDelay the delay between counts
   */
   public CountdownRunnable(int startingValue, int aDelay)
   {
      counter = startingValue;
      delay = aDelay;
   }
   
   // your work here

   private int counter;
   private int delay;

   // this method is used to test your work
   
   public static void main(String[] args)
   {
      CountdownRunnable r1 = new CountdownRunnable(10, 10);
      CountdownRunnable r2 = new CountdownRunnable(20, 5);
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      t1.start();
      t2.start();
   }   
}
