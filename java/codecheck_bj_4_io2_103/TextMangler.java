import java.io.IOException;
import java.io.RandomAccessFile;

public class TextMangler
{
   public static void swapAsAndOs(RandomAccessFile file) throws IOException
   {
      long pos = 0;
      while (pos < file.length())
      {
         char c = (char) file.read();
         char replacement = 0;
         if (c == 'a') replacement = 'o';
         if (c == 'A') replacement = 'O';
         else if (c == 'o') replacement = 'a';
         else if (c == 'O') replacement = 'A';
         if (replacement != 0)
         {
            file.seek(pos);
            file.write((byte) replacement);
         }
         pos++;
      }
   }   
   
   // this method checks your work
   
   public static void main(String[] args) throws IOException
   {
      RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
      swapAsAndOs(file);
      file.close();
   }   
}
