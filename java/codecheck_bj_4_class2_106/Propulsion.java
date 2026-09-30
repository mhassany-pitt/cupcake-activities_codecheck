/**
   Describes the characteristics of a vehicle's propulsion
*/

public class Propulsion
{
   private String engineType;
   private String fuel;
   /**
      Constructs a propulsion object
      @param aEngineType the type of engine
      @param aFuel the type of fuel used in this engine
   */
   public Propulsion(String aEngineType, String aFuel)
   {
      engineType = aEngineType;
      fuel = aFuel;
   }
   
   /**
      Formats the propulsion information for printing
      @returns a string sutiable for printing
   */
   public String format()
   {
      return "Engine Type: " + engineType + "\n" +
         "Fuel: " + fuel + "\n";
   }
}
