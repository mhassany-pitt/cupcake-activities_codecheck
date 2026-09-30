import java.util.List;

public class GenericUtil
{
   /**
      Finds all values in an array that fulfill a given predicate.
      @param values an array of values
      @param pred a predicate
      @return a list of values that match the predicate
   */
   public static <T> List<T> findAllMatches(T[] values, Predicate<T> pred)
   {
      ...
   }
}
