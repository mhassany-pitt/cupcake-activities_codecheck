/**
   A map  label has a place name, longitude and latitude
*/
public class MapLabels
{  
   private String placeName;
   private double latitude;
   private double longitude;

   /**
      Constructs a map label with place name, logitude and latitude
   */
   public MapLabels (String name, double aLat, double aLong)
   {   
     // your work here
     placeName = ...;
     latitude = ...;
     longitude = ...;
   }
 
   /**
      Gets the string in XML form
      @return the string
   */
   public String toString()
   {   
      //your work here
      // use \" to print a "
      String label = "<label name=\"" + placeName + ...;

      return label;
   }   
}
