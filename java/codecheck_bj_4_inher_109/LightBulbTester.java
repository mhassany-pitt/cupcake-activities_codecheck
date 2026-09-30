public class LightBulbTester
{
   public static void main(String[] args)
   {
      LightBulb bulb1 = new Incandescent(20);
      System.out.println(bulb1.getDescription());
      System.out.println("Expected: lumensPerWatt=20.0,shape=bulb");
      LightBulb bulb2 = new Fluorescent(62, "spiral");
      System.out.println(bulb2.getDescription());
      System.out.println("Expected: lumensPerWatt=62.0,shape=spiral");
      LightBulb bulb3 = new Fluorescent(72, "tube");
      System.out.println(bulb3.getDescription());
      System.out.println("Expected: lumensPerWatt=72.0,shape=tube");
   }
}
