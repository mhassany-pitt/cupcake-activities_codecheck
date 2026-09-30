public class MyMethods
{  
   public static String vowels(String s)
   {   
      return vowelsHelper(s, 0, "");
   }

   public static String vowelsHelper(String s, int index, String alreadyFoundVowels)
   {
      // your work here
   }

   public static boolean isVowel(char ch)
   {
      return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
   }
}
