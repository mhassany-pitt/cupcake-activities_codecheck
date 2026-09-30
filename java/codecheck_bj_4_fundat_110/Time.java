/**
   A class to compute the distance between two points in time.
*/
public class Time
{
   private int hours;
   private int minutes;

   /**
      Construct a Time.
      @param hrs the hours of the time (between 0 and 23)
      @param min the minutes of the time (between 0 and 59)
   */
   public Time(int hrs, int min)
   {
      hours = hrs;
      minutes = min;
   }
   
   /**
      Gets the hours of this time
      @return the hours
   */
   public int getHours() { return hours; }
   
   /**
      Gets the minutes of this time
      @return the minutes
   */
   public int getMinutes() { return minutes; }
   
   /**
      Gets the minutes from this time to another
      @param other another time
      @return the number of minutes from this time to the other
   */
   public int minutesUntil(Time other)
   {
      // your work here      
   }

   // this method is used to check your work

   public static int check(int h1, int m1, int h2, int m2)
   {
      Time first = new Time(h1, m1);
      Time second = new Time(h2, m2);
      return first.minutesUntil(second);
   }
}
