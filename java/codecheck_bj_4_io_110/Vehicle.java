/**
   Describes a vehicle with a self-contained propulsion unit.
*/
public class Vehicle
{
   private String type;
   private int wheelCount;
   
   /**
      Constructs a vehicle
      @param aType the type of the vehicle
      @param numWheels the number of wheels on this vehicle
   */
   public Vehicle(String aType, int numWheels)
   {
      if (aType.equals("motorcycle"))
      {
        if (numWheels != 2)
          throw new IllegalNumberOfWheels("Motorcycles need two wheels");
      }
      else if (numWheels < 4)
      {
        throw new IllegalNumberOfWheels();
      }
      type = aType;
      wheelCount = numWheels;
   }

   public String toString()
   {
      return "Vehicle[type=" + type + ",wheelCount=" + wheelCount + "]";
   }
}
