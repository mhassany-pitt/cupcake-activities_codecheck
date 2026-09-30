import javax.swing.*;

/**
   Shows a frame with three buttons
*/
public class ThreeDButtonViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(270, 200);
      frame.setTitle("ThreeD Button Viewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ThreeDButtonComponent component = new ThreeDButtonComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
