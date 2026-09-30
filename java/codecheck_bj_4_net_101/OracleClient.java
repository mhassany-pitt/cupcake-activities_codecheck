import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OracleClient
{
   public static String getAnswer(String question)
      throws IOException
   {
      OracleServer.start();
      final int PORT = 7777;
      
      // Connect to the port on localhost
      
      // Send the question
      
      // Get the response
      
      // Close the socket
      
      // Return the response
   }
}
