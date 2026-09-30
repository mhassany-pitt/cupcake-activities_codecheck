public class Pair<T, S>
{
   public Pair(T firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }
   
   public int hashCode() { return 31 * first.hashCode() + second.hashCode(); }
   
   public boolean equals(Object otherObject)
   {
      Pair other = (Pair) otherObject;
      return first.equals(other.first) && second.equals(other.second);
   }
   
   public T getFirst() { return first; }
   public S getSecond() { return second; }
   
   private T first;
   private S second;
}
