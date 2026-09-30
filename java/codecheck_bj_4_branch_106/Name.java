public class Name
{
   private String first;
   private String last;

   /**
      Constructs a name from a first and last name.
      @param aFirst the first name
      @param aLast the last name
   */
   public Name(String aFirst, String aLast)
   {
      first = aFirst;
      last = aLast;
   }

   /**
      Returns the first name of this name
      @return the first name
   */
   public String getFirst()
   {
      return first;
   }

   /**
      Returns the last name of this name
      @return the last name
   */
   public String getLast()
   {
      return last;
   }

   /**
      Checks whether this name should come before another name
      when sorted by last name, then by first name.
      @param other another name
      @return true if this name should come before other
   */
   public boolean comesBefore(Name other)
   {
      // your work here



   }


   // this method is used to check your work

   public static boolean check(String first1, String last1,
      String first2, String last2)
   {
      Name name1 = new Name(first1, last1);
      Name name2 = new Name(first2, last2);
      return name1.comesBefore(name2);
   }
}
