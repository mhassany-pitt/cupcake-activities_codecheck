import java.util.ArrayList;

public class MyMethods
{  
   public static String mkString(int[] values, String separator) 
   {
      if (values.length == 0) return "...";
      String helperResult = helper(values, ..., separator);
      ...
   }
   
   public static String helper(int[] values, int n, String separator)
   {
      if (n == ...) return ...;
      String partialResult = helper(values, ..., separator);
      ...
   }
}
