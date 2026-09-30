/**
   Represents an automobile.
*/

public class Auto extends Vehicle
{
   private String licensePlate;
   
   public Auto(String vin, String plate)
   {
      super(vin);
      licensePlate = plate;
   }

   // TODO: Override the equals method of the Object class to
   // test that VIN and license plate number are identical.
}
