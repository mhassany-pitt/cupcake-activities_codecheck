public class Interval
{
   private double lower;
   private double upper;

   /**
      Constructs an open interval.
      @param aLowerBound the lower bound
      @param anUpperBound the upper bound
   */
   public Interval(double aLowerBound, double anUpperBound)
   {
      lower = aLowerBound;
      upper = anUpperBound;
   }

   /**
      Checks whether a value is contained in the interval.
      @param x a value
      @return true if x is contained in the interval
   */
   public boolean contains(double x)
   {
      return lower < x && x < upper;
   }

   /**
      Gets the lower bound of this interval.
      @return the lower bound
   */
   public double getLower()
   {
      return lower;
   }

   /**
      Gets the lower bound of this interval.
      @return the lower bound
   */
   public double getUpper()
   {
      return upper;
   }

   /**
      Checks whether this interval overlaps with another.
      @param other another interval
      @return true if this interval and other overlap, i.e.
      have a non-empty intersection
   */
   public boolean overlaps(Interval other)
   {
      // your work here



   }

   // this method is used to check your work

   public static boolean check(double lower1, double upper1,
      double lower2, double upper2)
   {
      Interval first = new Interval(lower1, upper1);
      Interval second = new Interval(lower2, upper2);
      return first.overlaps(second);
   }
}
