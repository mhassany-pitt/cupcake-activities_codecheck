import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Squid
{
   /**
      Constructs a Squid (square inside diamond).
      @param aCenter the center point
      @param aRadius, the distance from the center to the corner points
      of the diamond
   */
   public Squid(Point2D.Double aCenter, double aRadius)
   {
      center = aCenter;
      radius = aRadius;
   }
   
   public void draw(Graphics2D g2)
   {
      // your work here
   }

   private Point2D.Double center;
   private double radius;   
}
