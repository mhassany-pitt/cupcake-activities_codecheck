import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class WordList
{
   public void duplicateShortWords(LinkedList<String> words)
   {
      // TODO: Complete method
   }

   public boolean isShortWord(String word)
   {
      return word.length() <= 3;
   }
   
   // this method is used to check your work
   public LinkedList<String> check(String[] elements)
   {
      LinkedList<String> words = new LinkedList<String>();
      words.addAll(Arrays.asList(elements));      
      duplicateShortWords(words);
      return words;
   }
}
