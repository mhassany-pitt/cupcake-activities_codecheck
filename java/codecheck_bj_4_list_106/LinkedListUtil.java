import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
   /**
      deletes all but the first two linked list enries
   */
   public static void processList(ListIterator iter)
   {  
      // Your work here
   }


   // This method is used to check your work
   public static LinkedList<String> check(String[] values)
   {    
      LinkedList<String> list = new LinkedList<String>();
      for (String s : values) list.add(s);
      
      processList(list.listIterator());

      return list;
   }

}
