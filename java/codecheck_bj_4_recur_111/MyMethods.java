public class MyMethods
{  
   public static String upperCase(String s)
   {   
      ...
      String upperCaseTail = upperCase(...);
      char ch = s.charAt(0);
      if (Character.isUpperCase(ch))
         ...
      else
         ...
   }
}
