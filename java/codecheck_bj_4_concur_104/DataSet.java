import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataSet
{
   /**
      Constructs an empty data set.
   */
   public DataSet(double[] values)
   {
      this.values = values;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage() 
   {
      if (values.length == 0) return 0;
      
      final int THREADS = 10;      
      int size = values.length / THREADS;
      RangeProcessor[] processors = new RangeProcessor[THREADS];
      Thread[] threads = new Thread[THREADS];
      for (int i = 0; i < THREADS; i++)
         processors[i] = new RangeProcessor(i * size, (i + 1) * size);

      // TODO: Start threads, wait for them to terminate, and compute result
      
   }

   private class RangeProcessor implements Runnable
   {
      public RangeProcessor(int start, int end)
      {
         this.start = start;
         this.end = Math.min(end, values.length);
      }
      
      public void run()
      {
         double total = 0;
         for (int i = start; i < end; i++)
            total += values[i];
         sum += total;
      }
      
      public double getSum()
      {
         return sum;
      }
      
      private int start;
      private int end;
      private double sum;
   }
   
   private double[] values;
   
   // this method is used to check your work
   
   public static void main(String[] args)  
   {
      final int SIZE = 10000000;
      double[] v = new double[SIZE];
      for (int i = 0; i < SIZE; i++) v[i] = i;
      DataSet data = new DataSet(v);
      double avg = data.getAverage();
      System.out.println(avg);
   }
}
