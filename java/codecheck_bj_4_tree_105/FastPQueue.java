import java.util.ArrayList;
import java.util.LinkedList;

public class FastPQueue
{
   public FastPQueue(int maxPriority)
   {
      itemLists = new ArrayList<LinkedList<Object>>();
      for (int i = 0; i <= maxPriority; i++)
         itemLists.add(new LinkedList<Object>());
   }
   
   public void add(int priority, Object item)
   {
      // TODO: Complete this method
   }
   
   public Object remove()
   {
      // TODO: Complete this method
   }
   
   private ArrayList<LinkedList<Object>> itemLists; // linked lists of items with the same priority
   
   // This method is used to check your work
   public static String[] check(String[] items)
   {
      FastPQueue pq = new FastPQueue(9);
      for (String item : items)
         pq.add(Integer.parseInt(item.substring(0, 1)), item.substring(1));
      String[] r = new String[items.length];
      for (int i = 0; i < r.length; i++)
         r[i] = pq.remove().toString();
      return r;
   }   
}
