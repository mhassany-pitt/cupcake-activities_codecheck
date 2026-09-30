public class MyMethods
{  
   public static int reverseInt(int value)
   {   
      . . .
   }

   public static int powerOfTen(int exponent)
   {
      if (exponent <= 0) return 1;
      else return 10 * powerOfTen(...);
   }
   
   public static int numberOfDigits(int value)
   {
      if (value < 10) return 1;
      else return 1 + numberOfDigits(...);
   }
}
