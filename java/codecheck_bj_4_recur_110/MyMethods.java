import java.util.ArrayList;

public class MyMethods
{  
   public static String toStringInReverse(int[] values) 
   {
      if (values.length == 0) return "...";
      String helperResult = helper(values, ...);
      ...
   }
   
   public static String helper(int[] values, int n)
   {
      if (n == ...) return ...;
      String partialResult = helper(values, ...);
      ...
   }
}
