/**
   This class sorts an array, using the selection sort 
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
      // TODO: reset visitCount
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minimumPosition(i);
         swap(minPos, i);
      }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private int minimumPosition(int from)
   {
      // TODO: update visitCount
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i] < a[minPos]) minPos = i;
      return minPos;
   }

   /**
      Swaps two entries of the array.
      @param i the first position to swap
      @param j the second position to swap
   */
   private void swap(int i, int j)
   {
      // TODO: update visitCount
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   public int getVisitCount() { return visitCount; }

   private int[] a;
   private int visitCount;
   
   // this method is used to check your work
   public static int check(int[] values)
   {
      SelectionSorter sorter = new SelectionSorter(values);
      sorter.sort();
      return sorter.getVisitCount();      
   }
}
