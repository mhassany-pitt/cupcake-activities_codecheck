public class ElementTester
{
   public static void main(String[] args)
   {
      System.out.println(Element.getMeltedElements(30));
      System.out.println("Expected: [H, O, N, Cl, Hg]");
      System.out.println(Element.getMeltedElements(-270));
      System.out.println("Expected: []");
      System.out.println(Element.getMeltedElements(-40));
      System.out.println("Expected: [H, O, N, Cl]");
      System.out.println(Element.getMeltedElements(1000));
      System.out.println("Expected: [H, O, N, Cl, Hg, K, Na]");
   }   
}
