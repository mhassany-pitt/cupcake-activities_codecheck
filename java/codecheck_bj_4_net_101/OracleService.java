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
            in = new Scanner(s.getInputStream());
            out = new PrintWriter(s.getOutputStream());
            String command = in.nextLine();
            
            String[] questionWords = { "where", "when", "what", "why", "how",
               "who", "which" };
            boolean isQuestion = false;
            for (int i = 0; !isQuestion && i < questionWords.length; i++)         
               if (command.toLowerCase().startsWith(questionWords[i] + " "))
                  isQuestion = true;
            if (isQuestion)
               out.println("The answer is 42.");
            else
               out.println("That was not a question.");
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
