import java.io.IOException;
import java.io.RandomAccessFile;

public class TextMangler
{
   public static void swapAdjacentBytes(RandomAccessFile file) throws IOException
   {
      // TODO: complete
   }   
   
   // this method checks your work
   
   public static void main(String[] args) throws IOException
   {
      RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
      swapAdjacentBytes(file);
      file.close();
   }   
}
