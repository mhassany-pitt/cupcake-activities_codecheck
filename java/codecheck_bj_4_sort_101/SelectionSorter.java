/**
   This class sorts an array, using a modified selection sort 
   algorithm
*/
public class SelectionSorter
{
   /**
      Constructs a selection sorter.
      @param anArray the array to sort
   */
   public SelectionSorter(int[] anArray)
   {
      a = anArray;
   }

   /**
      Sorts the array managed by this selection sorter.
   */
   public void sort()
   {  
      // TODO: add loop bounds
      for (int i = ...; i > ...; i--)
      {  
         int maxPos = maximumPosition(i);
         swap(maxPos, i);
      }
   }

   /**
      Finds the largest element in a subrange of the array.
      @param to the last position in a to compare
      @return the position of the largest element in the
      range a[0] . . . a[to]
   */
   private int maximumPosition(int to)
   {
      // your work here
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

   private int[] a;
   
   // this method is used to check your work
   public static int[] check(int[] values)
   {
      SelectionSorter sorter = new SelectionSorter(values);
      sorter.sort();
      return values;
   }
}
