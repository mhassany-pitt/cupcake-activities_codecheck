/**
   A linked list is a sequence of nodes with efficient
   element insertion and removal. This class 
   contains a subset of the methods of the standard
   java.util.LinkedList class.
*/
public class LinkedList
{  
   private Node first;
      
   /** 
      Constructs an empty linked list.
   */
   public LinkedList()
   {  
      first = null;
   }
   
   /**
      Adds an element to the front of the linked list.
      @param element the element to add
   */
   public void addFirst(Object element)
   {  
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }

   /**
      Adds an element to the end of the linked list.
      @param element the element to add
   */
   public void addLast(Object element)
   {  
      // your work here
   }
   
   public String toString()
   {
      String r = "[";
      for (Node current = first; current != null; current = current.next)
      {
         if (current != first) r = r + ",";
         r = r + current.data;
      }
      return r + "]";    
   }
   
   class Node
   {  
      public Object data;
      public Node next;
   }   
   
   // This method is used to check your work
   public static String check(String[] first, String[] last)
   {
      LinkedList list = new LinkedList();
      for (String s : last) list.addLast(s);
      for (String s : first) list.addFirst(s);
      return list.toString();
   }      
}
