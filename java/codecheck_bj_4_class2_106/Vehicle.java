/**
   Describes a vehicle with a self-contained propulsion unit.
*/
public class Vehicle
{
   /*
     TODO: To increase cohesion, reimplement this class by using
     the Propulsion class. Do not modify the main method that is use
     for checking.
   */

   private String make;
   private String model;
   private String year;
   private String type;
   private int wheelCount;
   private String engineType;
   private String fuel;

   /**
      Constructs a vehicle
      @param aMake the vehicle's make
      @param aModel the vehicle's model
      @param aType the type of the vehicle
      @param numWheels the number of wheels on this vehicle
      @param aFuel the type of fuel used by this vehicle
   */
   
   public Vehicle(String aMake, String aModel, String aYear,
      String aType, int numWheels, String aEngineType, String aFuel)
   {
      make = aMake;
      model = aModel;
      year = aYear;
      type = aType;
      wheelCount = numWheels;
      engineType = aEngineType;
      fuel = aFuel;
   }
   
   public static void main(String[] args)
   {
      Vehicle auto = new Vehicle("Ford","Taurus","2010","automobile",
         4,new Propulsion("combustion","gasoline"));
      System.out.println(auto.formatForPrinting());
   }

   /**
    * Formats the vehicle information for printing
    * @returns a string sutiable for printing
    */
   public String formatForPrinting()
   {
      return "Make: " + make + "\n"
         + "Model: " + model + "\n"
         + "Year: " + year + "\n"
         + "Type: " + type + "\n"
         + "Number of wheels: " + wheelCount + "\n"
         + "Engine type: " + engineType + "\n"
         + "Fuel: " + fuel + "\n";
   }   
}
