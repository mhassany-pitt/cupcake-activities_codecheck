import javax.swing.*;

/**
   This class shows a frame containing random balloons.
*/
public class BalloonViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      final int NBALLOONS = 40;
      
      frame.setSize(400, 400);
      frame.setTitle("BalloonViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      BalloonComponent component = new BalloonComponent(NBALLOONS);
      frame.add(component);
      
      frame.setVisible(true);
   }
}
