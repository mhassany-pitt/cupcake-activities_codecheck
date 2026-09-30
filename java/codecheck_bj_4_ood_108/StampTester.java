public class StampTester
{
   public static void main(String[] args)
   {
      Measurable m1 = new Stamp("Bicentennial", 38.0, "U.S.");
      System.out.println(m1.getMeasure());
      System.out.println("Expected: 38.0");
      Comparable c1 = new Stamp("Boxing Day",35.0,"U.K.");
      System.out.println(c1.compareTo(m1) < 0);
      System.out.println("Expected: true");      
   }
}
