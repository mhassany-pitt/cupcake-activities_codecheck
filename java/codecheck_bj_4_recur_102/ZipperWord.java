public class ZipperWord
{
   public ZipperWord(String word1, String word2)
   {
      assert word1.length() == word2.length();
      first = word1;
      second = word2;
   }

   public String toString()
   {
      // your work here   
   }

   private String first;
   private String second;

   // this method is used to check your work

   public static String check(String word1, String word2)
   {
      ZipperWord zippy = new ZipperWord(word1, word2);
      return zippy.toString();
   }
}
