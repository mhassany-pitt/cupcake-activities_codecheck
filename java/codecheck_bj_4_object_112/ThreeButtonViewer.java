import javax.swing.*;

/**
   Shows a frame with three buttons
*/
public class ThreeButtonViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(270, 200);
      frame.setTitle("Three Button Viewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ThreeButtonComponent component = new ThreeButtonComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
