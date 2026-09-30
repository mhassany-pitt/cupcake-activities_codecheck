import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

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

      // Open socket

      // Get streams
      
      // Turn streams into scanners and writers

      // Send command

      String command = "GET " + resource + " HTTP/1.0\n\n";
      out.print(command);
      out.flush();

      // Read server response and print any lines starting with 
      // Set-Cookie, set-cookie, 

      // Always close the socket at the end
      
   }
}
