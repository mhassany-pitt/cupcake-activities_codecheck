import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class WordList
{
   public String concatenateBackwards(LinkedList<String> words)
   {
      // TODO: Complete method
   }

   // this method is used to check your work
   public String check(String[] elements)
   {
      LinkedList<String> words = new LinkedList<String>();
      words.addAll(Arrays.asList(elements));      
      return concatenateBackwards(words);
   }
}
