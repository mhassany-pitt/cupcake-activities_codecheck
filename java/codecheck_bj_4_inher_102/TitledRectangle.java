/* 
   TODO: Complete this class so that the title is printed
   centered in the rectangle. Hint: Override printLine.
*/

/**
   A rectangle whose interior is filled with a pattern
   obtained by repeating a character.
*/
public class TitledRectangle extends Rectangle
{
   /**
      Constructs a rectangle with a given width, height, and title
      @param aWidth the width (including the corners)
      @param aHeight the height (including the corners)
      @param aTitle the title
   */
   public TitledRectangle(int aWidth, int aHeight, String aTitle)
   {
      super(aWidth, aHeight);
      title = aTitle;
   }




   private String title;

   // The following method tests your class

   public static void main(String[] args)
   {
      TitledRectangle tr = new TitledRectangle(15, 7, "Hello");
      tr.print();
   }
}
