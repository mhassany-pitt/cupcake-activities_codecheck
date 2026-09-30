/**
   Tests the CarMuseum class.
*/
public class CarMuseumTester
{
   public static void main(String[] args)
   {
      CarMuseum museum = new CarMuseum("1949 Ford,1943 Studebaker," +
         "1950 Chevrolet,1948 Pontiac,1949 Ford,1944 Pontiac,1949 Studebaker");
      System.out.println("Number of cars in garage: " + museum.getMeasure());
      System.out.println("Expected: 6.0");
   }       
}
