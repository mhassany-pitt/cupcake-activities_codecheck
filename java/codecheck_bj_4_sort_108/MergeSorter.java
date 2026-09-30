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
      Places the even elements before the odd ones.
   */
   public void evenFirst()
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
      firstSorter.evenFirst();
      secondSorter.evenFirst();
      merge(first, second);
   }

   /**
      Merges two arrays into the array managed by this
      merge sorter. 
      @param first the first array which has the even elements before the odd ones
      @param second the second array which has the even elements before the odd ones
   */
   private void merge(int[] first, int[] second)
   {  
      // TODO
   }
   
   // this method is used to check your work
   public static int [] check(int [] a)
   {
      MergeSorter sorter = new MergeSorter(a);
      sorter.evenFirst();
      return a;
   }
}
