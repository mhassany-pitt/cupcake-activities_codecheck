/**
 Temperature class represents a specific temperature value in a specific scale.
 */

public class Temperature
{
   private String scale;
   private double value;
   private static Converter toCelsius = ...
   private static Converter toFahrenheit = ...

   /**
      Constructs a temperature.
      @param aValue the temperature value in the given scale
      @param aScale "C" for Celsius, "F" for Fahrenheit
   */
   public Temperature(double aValue, String aScale)
   {
      value = aValue;
      scale = aScale;
   }
   
   public String getScale()
   {
      return scale;
   }
   
   public double getValue()
   {
      return value;
   }

   /**
      Compares two temparatures.
      @param other another Tempeature object to be compared with this one
      @return -1 if the other object's value is larger than this object's value
               0 if the values are equal
               1 if the other object's value is smaller than this object's value.
   */
   public int compareTemps(Temperature other)
   {
      // Use the appropriate converter so that you can compare the values
      
   }
}
