import javax.swing.*;

/**
   Shows a frame with two rectangles
*/
public class IntersectionViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("IntersectionViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      IntersectionComponent component = new IntersectionComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
