import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class IntersectionComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      Rectangle box1 = new Rectangle(5, 10, 100, 120);
      Rectangle box2 = new Rectangle(50, 60, 100, 120);
      // your work here
      ...
      ...
      
   }
}
