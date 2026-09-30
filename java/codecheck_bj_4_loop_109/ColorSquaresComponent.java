import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
   Draws colored squares.
 */
public class ColorSquaresComponent extends JComponent
{
   private String colors;
   private int wide;
   private int high;
   private int size;
   
   /**
     Constructs a component for a drawing made up of colored squares.
     @param col the color codes of all squares in the drawing.
     @param w the width of the drawing
     @param h the height of the drawing
     @param sideLength the side length of each square
   */
   public ColorSquaresComponent(String col, int w, int h, int boxSize)
   {
     colors = col;
     wide = w;
     high = h;
     size = boxSize;
   }  
   
   private Color getSquareColor(char code)
   {
     if (code == 'R') return Color.RED;
     if (code == 'G') return Color.GREEN;
     if (code == 'B') return Color.BLUE;
     if (code == 'C') return Color.CYAN;
     if (code == 'M') return Color.MAGENTA;
     if (code == 'Y') return Color.YELLOW;
     if (code == 'K') return Color.BLACK;
     return Color.WHITE;      
   }
      
   public void paintComponent(Graphics g)
   {
     Graphics2D g2 = (Graphics2D) g;
     Rectangle box = new Rectangle (0,0, size, size);
     // your work here - draw all of the boxes in the specified color
     
     
     
     
     
   }
}
