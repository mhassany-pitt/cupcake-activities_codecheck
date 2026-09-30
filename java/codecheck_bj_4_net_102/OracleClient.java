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
      Socket s = new Socket("localhost", PORT);
      InputStream instream = s.getInputStream();
      OutputStream outstream = s.getOutputStream();
      Scanner in = new Scanner(instream);
      PrintWriter out = new PrintWriter(outstream); 
      
      out.println(question);
      out.flush();
      String response = in.nextLine();
      s.close();
      return response;      
   }
}
