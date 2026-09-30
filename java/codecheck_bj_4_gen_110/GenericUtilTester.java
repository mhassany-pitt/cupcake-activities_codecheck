import java.util.List;

public class GenericUtilTester
{
   public static void main(String[] args)
   {
      Predicate<Integer> isEven = new Predicate<Integer>()
         {
            public boolean invoke(Integer value)
            {
               return value % 2 == 0;
            }
         };
         
      Integer[] values1 = { 1, 4, 9, 16, 25, 36, 49 };
      List<Integer> matches1 = GenericUtil.findAllMatches(values1, isEven);
      System.out.println(matches1);
      System.out.println("Expected: [4, 16, 36]"); 

      Predicate<String> isShort = new Predicate<String>()
         {
            public boolean invoke(String value)
            {
               return value.length() <= 3;
            }
         };
         
      String[] values2 = { "Mary", "had", "a", "little", "lamb" };
      List<String> matches2 = GenericUtil.findAllMatches(values2, isShort);
      System.out.println(matches2);
      System.out.println("Expected: [had, a]");       
   }
}
