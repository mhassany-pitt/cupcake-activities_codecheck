public class Pair<T, S> 
   implements Comparable<Pair<T, S>>
{
   public Pair(T firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }
      
   public T getFirst() { return first; }
   public S getSecond() { return second; }
   
   // your compareTo method here
   
   private T first;
   private S second;
   
   // this method is used to check your work
   
   public static int check(Integer i1, String s1, Integer i2, String s2)
   {
      Pair<Integer, String> p1 = new Pair<Integer, String>(i1, s1);
      Pair<Integer, String> p2 = new Pair<Integer, String>(i2, s2);
      int d = p1.compareTo(p2);
      if (d < 0) return -1;
      if (d > 0) return 1;
      return 0;
   }
}
