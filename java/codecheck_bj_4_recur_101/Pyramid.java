public class Pyramid
{
   public Pyramid(int sideLength)
   {
      length = sideLength;
   }

   public int getVolume()
   {
      // your work here
   }

   private int length;

   // this method is used to check your work

   public static int check(int n)
   {
      Pyramid p = new Pyramid(n);
      return p.getVolume();
   }
}
