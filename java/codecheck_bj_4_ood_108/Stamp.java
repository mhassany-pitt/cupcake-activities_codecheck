/**
   Stamp class represents a single postage stamp.
*/
public class Stamp extends AbstractMeasurable
{
   private String description;
   private double faceValue;
   private String issuingCountry;

   public Stamp(String aDesc, double aValue, String aCountry)
   {
      description = aDesc;
      faceValue = aValue;
      issuingCountry = aCountry;
   }

   public double getValue()
   {
      return faceValue;
   }
   
   public String getCountry()
   {
      return issuingCountry;
   }

   public String getDescription()
   {
      return description;
   }

   public double getMeasure()
   {
      return faceValue;  
   }
}
