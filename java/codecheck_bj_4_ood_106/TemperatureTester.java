public class TemperatureTester
{
   public static void main(String[] args)
   {
      Temperature temp1 = new Temperature(10, "C");
      Temperature temp2 = new Temperature(20, "F");
      System.out.println(Math.signum(temp1.compareTo(temp2)));
      System.out.println("Expected: 1");
      temp1 = new Temperature(20, "F");
      temp2 = new Temperature(10, "C");
      System.out.println(Math.signum(temp1.compareTo(temp2)));
      System.out.println("Expected: -1");
      temp1 = new Temperature(-40, "F");
      temp2 = new Temperature(-40, "C");
      System.out.println(Math.signum(temp1.compareTo(temp2)));
      System.out.println("Expected: 0");
      temp1 = new Temperature(20, "C");
      temp2 = new Temperature(10, "C");
      System.out.println(Math.signum(temp1.compareTo(temp2)));
      System.out.println("Expected: 1");      
   }
}
