import java.util.Arrays;

/**
   This modified SelectionSorter class places the even elements followed by the odd 
   elements in the array, maintaining the original order of the even elements.
*/

public class SelectionSorter
{
   private int[] a;

   /**
      Constructs a selection sorter.
      @param anArray the array to sort
   */
   public SelectionSorter(int[] anArray)
   {
      a = anArray;
   }

   /**
      Places the even elements followed by the odd elemens in the array, maintaining the original
     order of the even elements. Visit each element of the array, swapping odd 
     elements with the first even one that follows. For example:
     [5,6,4,6,9,2]
     [6,5,4,6,9,2]
     [6,4,5,6,9,2]
     [6,4,6,5,9,2]
     [6,4,6,2,9,5]
   */
   public void evenOdd()
   {  
      // TODO
   }

   /**
      Finds the first even element starting at posiion index
      @return the position first even element
   */
   private int firstEven(int index)
   {
      // TODO
   }

   /**
      Swaps two entries of the array.
      @param i the first position to swap
      @param j the second position to swap
   */
   private void swap(int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   // this method is used to check your work
   public static int[] check(int[] values)
   {
      SelectionSorter sorter = new SelectionSorter(values);
      sorter.evenOdd();
      return values;
   }
}
