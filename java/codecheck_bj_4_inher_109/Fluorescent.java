/**
   Describes a fluorescent light bulb.  May have a shape such as tube
   or spiral.
*/
public class Fluorescent extends LightBulb
{
   private String shape;

   public Fluorescent(double lumens, String aShape)
   {
      super(lumens);
      shape = aShape;
   }

   public String getShape()
   {
      return shape;
   }
}
