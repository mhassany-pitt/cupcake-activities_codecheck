import java.awt.Rectangle;

public class RectangleDoublerTester
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      RectangleDoubler doubler = new RectangleDoubler();
      
      System.out.println(doubler.makeDouble(doubler.makeDouble(box)).toString());
      System.out.println("Expected: java.awt.Rectangle[x=5,y=10,width=80,height=120]");
   }
}
