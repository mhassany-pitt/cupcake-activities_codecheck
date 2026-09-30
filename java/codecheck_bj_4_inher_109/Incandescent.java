/**
   Represents an old-fashioned incandescent light bulb.
*/

public class Incandescent extends LightBulb
{
   public Incandescent(double lumens)
   {
      super(lumens);
   }

   public String getShape()
   {
      return "bulb";
   }
}
