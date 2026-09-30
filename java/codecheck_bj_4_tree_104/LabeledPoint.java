public class LabeledPoint
{
   /**
      Constructs a labeled point with a given position and label.
      @param anX the x-coordinate of the point
      @param aY the y-coordinate of the point
      @param aLabel the label of the point
   */
   public LabeledPoint(int anX, int aY, String aLabel)
   {
      x = anX;
      y = aY;
      label = aLabel;
   }

   public boolean equals(Object otherObject)
   {
      LabeledPoint other = (LabeledPoint) otherObject;
      return x == other.x && y == other.y && label.equals(other.label);
   }
   
   public int hashCode()
   {
      // TODO: Complete method
   }

   // This method tests your work
   public static boolean check(int x1, int y1, String s1, int x2, int y2, String s2)
   {
      LabeledPoint lp1 = new LabeledPoint(x1, y1, s1);
      LabeledPoint lp2 = new LabeledPoint(x2, y2, s2);
      return lp1.hashCode() == lp2.hashCode();
   }

   private int x;
   private int y;
   private String label;
}
