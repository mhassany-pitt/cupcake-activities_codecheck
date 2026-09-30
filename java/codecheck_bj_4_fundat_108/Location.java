/**
   A class to describe the location of a place on Earth.
*/
public class Location
{
   private double latid;
   private double longit;

   private static final double EARTH_RADIUS = 6371;

   /**
      Construct a location with a given latitude and longitude (in degrees)
   */
   public Location(double latitude, double longitude)
   {
      . . .
   }

   public double getLongitudeInRadians() { return longit; }

   public double getLatitudeInRadians() { return latid; }
   
   /**
      Gets the distance between two locations in kilometers
      @param other another location
      @return the distance between this location and other
   */
   public double getDistance(Location other)
   {
      . . .
   }
}
