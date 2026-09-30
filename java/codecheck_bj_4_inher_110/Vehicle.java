/**
   Represents a vehicle of any type.
*/
public class Vehicle
{
   private String id;

   public Vehicle(String anId)
   {
      id = anId;
   }
   
   public boolean equals(Object otherObject)
   {
      Vehicle other = (Vehicle) otherObject;
      return id.equals(other.id);
   }
}
