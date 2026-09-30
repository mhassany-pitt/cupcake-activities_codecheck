import java.util.ArrayList;
import java.util.Collections;

public class ZipperWordGenerator
{
   public ZipperWordGenerator(String word1, String word2)
   {
      assert word1.length() == word2.length();
      first = word1;
      second = word2;
   }
   
   public ArrayList<String> getZipperWords() 
   {
      // your work here
   }
   
   private String first;
   private String second;   
   
   // this method is used to check your work
   public static ArrayList<String> check(String word1, String word2)
   {
      ZipperWordGenerator gen = new ZipperWordGenerator(word1, word2);
      ArrayList<String> r = gen.getZipperWords();
      Collections.sort(r); // to make result independent of insertion order
      return r;   
   }      
}
