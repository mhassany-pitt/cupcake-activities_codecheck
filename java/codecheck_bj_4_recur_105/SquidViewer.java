import javax.swing.*;

public class SquidViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(450, 450);
      frame.setTitle("A recursive squid");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SquidComponent component = new SquidComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
