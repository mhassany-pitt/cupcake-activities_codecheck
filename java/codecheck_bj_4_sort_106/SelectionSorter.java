/**
   This modified SelectionSorter class places only the largest and the smallest elements correctly.
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
      Places the max and min array elements correctly
   */
   public void minmax()
   {  
      // TODO: swap appropriately
      int maxPos = maximumPosition();

      // TODO: swap appropriately
      int minPos = minimumPosition();

   }

   /**
      Finds the largest element in the array.
      @return the position of the largest element in the array
   */
   private int maximumPosition()
   {
      // your work here
   }

   /**
      Finds the smallest element in a subrange of the array.
      @return the position of the smallest element in the array
   */
   private int minimumPosition()
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
      sorter.minmax();
      return values;
   }
}
