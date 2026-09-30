// TODO: Complete the pathLengths method in the Node class. 

import java.util.Set;
import java.util.TreeSet;

/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/
public class BinarySearchTree
{
   // This method is used to check your work
   
   public static Set<Integer> check(String[] values)
   {
      BinarySearchTree tree = new BinarySearchTree();
      for (String v : values)
         tree.add(v);
      return tree.pathLengths();
   }
   
   /**
      Constructs an empty tree.
   */
   public BinarySearchTree()
   {  
      root = null;
   }

   public Set<Integer> pathLengths()
   {
      if (root == null) return null;
      return root.pathLengths();
   }
   
   /**
      Inserts a new node into the tree.
      @param obj the object to insert
   */
   public void add(Comparable obj) 
   {  
      Node newNode = new Node();
      newNode.data = obj;
      newNode.left = null;
      newNode.right = null;
      if (root == null) root = newNode;
      else root.addNode(newNode);
   }

   private Node root;

   /**
      A node of a tree stores a data item and references
      of the child nodes to the left and to the right.
   */
   private class Node
   {  
      
      public Set<Integer> pathLengths()
      {
         // TODO: Complete this method
      }
      
      /**
         Inserts a new node as a descendant of this node.
         @param newNode the node to insert
      */
      public void addNode(Node newNode)
      {  
         int comp = newNode.data.compareTo(data);
         if (comp < 0)
         {  
            if (left == null) left = newNode;
            else left.addNode(newNode);
         }
         else if (comp > 0)
         {  
            if (right == null) right = newNode;
            else right.addNode(newNode);
         }
      }
   
      public Comparable data;
      public Node left;
      public Node right;
   }
}



