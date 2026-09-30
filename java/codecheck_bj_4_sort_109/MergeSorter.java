/**
   This class sorts an array, using the merge sort algorithm.
*/
public class MergeSorter
{

   private int[] a;

   /**
      Constructs a merge sorter.
      @param anArray the array to sort
   */
   public MergeSorter(int[] anArray)
   {
      a = anArray;
   }
   
   /**
      Sorts the array managed by this merge sorter.
   */
   public void sort()
   {  
      if (a.length <= 1) return;
      int[] first = new int[a.length / 2];
      int[] second = new int[a.length - first.length];
      // Copy the first half of a into first, the second half into second
      for (int i = 0; i < first.length; i++) { first[i] = a[i]; }
      for (int i = 0; i < second.length; i++) 
      { 
         second[i] = a[first.length + i]; 
      }
      MergeSorter firstSorter = new MergeSorter(first);
      MergeSorter secondSorter = new MergeSorter(second);
      firstSorter.sort();
      secondSorter.sort();
      merge(first, second);
   }

   /**
      Merges two sorted arrays into the array managed by this
      merge sorter. 
      @param first the first sorted array
      @param second the second sorted array
   */
   private void merge(int[] first, int[] second)
   {  
      // TODO: Modify the merge method so that the merging produces a descending sort         
   }

   
   // this method is used to check your work
   public static int [] check(int [] a)
   {
      MergeSorter sorter = new MergeSorter(a);
      sorter.sort();
      return a;
   }
}
