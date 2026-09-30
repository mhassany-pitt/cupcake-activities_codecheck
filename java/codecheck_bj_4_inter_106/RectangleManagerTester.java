/**
   Tests the implementation of the RectangleManager class
*/

import java.awt.Rectangle;

public class RectangleManagerTester
{
   public static void main(String[] args)
   {
      Rectangle r = new Rectangle(0,0,10,20);
      RectangleManager rectMgr = new RectangleManager();
      int w = 5;
      int h = 7;
      r = (Rectangle) rectMgr.adjustDimensions(r, w, h);
      String dims = r.width + " x " + r.height;
      System.out.println("New dimensions: " + dims);
      System.out.println("Expected: 15 x 27");
   }
}
