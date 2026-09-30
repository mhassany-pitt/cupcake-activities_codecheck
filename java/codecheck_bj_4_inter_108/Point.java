/**
   Represents a point on a graph with coordinates (x,y).
*/

public class Point
{
   private int x; //the coordinate on the x axis
   private int y; //the coordinate on the y axis

   public Point(int xCoord, int yCoord)
   {
      x = xCoord;
      y = yCoord;
   }

   /**
      Returns the value of the x-coordinate of the point
      @return x-coordinate
   */
   public int getX()
   {
      return x;
   }

   /**
      Returns the value of the y-coordinate of the point
      @return y-coordinate
   */   
   public int getY()
   {
      return y;
   }      
}
