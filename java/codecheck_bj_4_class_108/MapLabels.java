/**
   A map label has a place name, longitude and latitude
*/
public class MapLabels
{  
   private String placeName;
   private double latitude;
   private double longitude;

   /**
      Constructs a map label with place name, logitude and latitude given in decimal degrees
   */
   public MapLabels (String name, double aLat, double aLong)
   {   
      // your work here
      placeName = ...;
      latitude = ...;
      longitude = ...;
   }
   
   /**
      Constructs a map label with place name, logitude and latitude given in degrees, minutes, seconds
   */
   public MapLabels (String name, int degLat, int minLat, double secLat, int degLong, int minLong, double secLong)   
   {   
      // your work here
      placeName = ...;
      // decimalDegress = Math.signum(degrees) * (Math.abs(degrees) + minutes/60. + seconds/3600.);
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
