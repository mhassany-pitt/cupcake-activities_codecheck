import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
   /**
      Adds an element after the first and another before the last element of a linked list.
      @param iter a linked list iterator
      @param front the element to add after the first element
      @param back the element to add before the last element
   */
   public static void processList(ListIterator<String> iter, String front, String back)
   {
      // Your work here
   }
 
   // This method is used to check your work
 
   public static LinkedList<String> check(String[] values, String s1, String s2)
   {
      LinkedList<String> list = new LinkedList<String>();
      for (String s : values) list.addLast(s);

      processList(list.listIterator(), s1, s2);
      return list;
   }
}
