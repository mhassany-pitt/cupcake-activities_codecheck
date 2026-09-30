import java.util.List;

public class GenericUtilTester
{
   public static void main(String[] args)
   {      
      List<String> threeHellos = GenericUtil.replicate("Hello", 3);
      System.out.println(threeHellos);
      System.out.println("Expected: [Hello, Hello, Hello]");
      List<Integer> five42s = GenericUtil.replicate(42, 5);
      System.out.println(five42s);
      System.out.println("Expected: [42, 42, 42, 42, 42]");      
   }
}
