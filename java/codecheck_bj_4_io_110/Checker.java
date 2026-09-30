public class Checker
{
   // This method is used to check your work.
   public static String check(String aType, int numWheels)
   {
      try
      {
        Vehicle aVehicle = new Vehicle(aType, numWheels);
        return aVehicle.toString();
      }
      catch (IllegalArgumentException ex)
      {
        return "IllegalArgumentException: " + ex.getMessage();
      }
      catch (Exception ex)
      {
        return "Exception: " + ex.getMessage();
      }
   }
}
