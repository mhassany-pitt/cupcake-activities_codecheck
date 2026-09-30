import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class PopularNames
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("Male:");
      printPopularNames("http://www.census.gov/genealogy/names/dist.male.first");
      System.out.println("Female:");
      printPopularNames("http://www.census.gov/genealogy/names/dist.female.first");
   }
   
   public static void printPopularNames(String urlString) throws IOException
   {
      // Connect to server      
      
      // Check if response code is HTTP_OK (200)
     
      // Read server response

      while (. . .)
      {
         // Read one record
         
         // Print rank and name
      }
   }
}
