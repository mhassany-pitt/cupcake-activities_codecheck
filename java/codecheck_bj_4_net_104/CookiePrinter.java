import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
   This program prints all cookies that a web site tries to set.
   Supply the name of the host and the resource on the command-line, 
   for example java CookiePrinter nytimes.com /
*/
public class CookiePrinter
{
   public static void main(String[] args) throws IOException
   {
      // Get command-line arguments

      if (args.length != 2)
      {
         System.out.println("Usage: java CookiePrinter host resource");
         System.exit(0);
      }
      String host = args[0];
      String resource = args[1];

      // Open URLConnection
     
      // Get header fields
      
      Map<String, List<String>> headerFields = connection.getHeaderFields();
      
      // print any lines starting with Set-Cookie, set-cookie, etc. 
      
      for (. . .)
      {
         . . .
         System.out.println(key + ": " + cookie);
      }
   }
}
