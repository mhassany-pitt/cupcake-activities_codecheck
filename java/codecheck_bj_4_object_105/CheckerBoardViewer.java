import javax.swing.*;

/**
   Shows a frame with a checkerboard
*/
public class CheckerBoardViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("CheckerBoardViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      CheckerBoardComponent component = new CheckerBoardComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
