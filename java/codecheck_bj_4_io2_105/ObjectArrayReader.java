import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class ObjectArrayReader
{
   public Object[] readObjects(FileInputStream fileIn)
      throws IOException
   {
      . . .
   }
   
   // The following method checks your code. Do not modify it in any way.
   
   public String check(String filename)
   {
      try
      {         
         Object[] values = readObjects(new FileInputStream(filename));
         return Arrays.toString(values);
      }
      catch (IOException ex)
      {
         return ex.toString();
      }      
   }
}
