import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class SquidComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      Squid s = new Squid(new Point2D.Double(200, 200), 200);
      s.draw(g2);
   }   
}
