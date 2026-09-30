import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
   Answers a question that was sent from a socket.
*/
public class OracleService implements Runnable
{
   /**
      Constructs a service object that processes a question.
      @param aSocket the socket
   */
   public OracleService(Socket aSocket)
   {
      s = aSocket;
   }

   public void run()
   {
      try
      {
         try
         {
            // Get scanner and print writer

            // get input line
            
            // check if it is a question
            
            // send answer

            out.flush();
         }
         finally
         {
            s.close();
         }
      }
      catch (IOException exception)
      {
         exception.printStackTrace();
      }
   }

   private Socket s;
   private Scanner in;
   private PrintWriter out;
}
