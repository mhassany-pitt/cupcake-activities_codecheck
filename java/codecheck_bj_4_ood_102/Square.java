import java.awt.Rectangle;

public class Square
{
   /**
      Constructs a square with a given position and side length.
      @param x the x-coordinate of the top left corner
      @param y the y-coordinate of the top left corner
      @parameter sideLength the length of each side
   */   
   public Square(int x, int y, int sideLength)
   {
      // TODO
   }
   
   /**
      Translates this square the indicated distance,
      to the right along the x coordinate axis, and 
      downward along the y coordinate axis.
      @param dx the distance to move along the x axis
      @param dy the distance to move along the y axis
   */   
   public void translate(int dx, int dy)
   {
      // TODO
   }
   
   /**
      Sets the new side length of this square.
      @param newSideLength the new side length
   */
   public void setSideLength(int newSideLength)
   {
      // TODO
   }
   
   public String toString()
   {
      // TODO
   }
         
   private Rectangle rect;
   
   // The following method checks your work.
   
   public static Square check(int x, int y, int sideLength, int dx, int dy, int newSideLength)
   {
      Square sq = new Square(x, y, sideLength);
      sq.translate(dx, dy);
      sq.setSideLength(newSideLength);
      return sq.toString();
   }
}
