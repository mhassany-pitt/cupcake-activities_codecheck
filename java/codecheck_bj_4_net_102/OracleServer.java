import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
   A server that receives client connections to the oracle service.
*/
public class OracleServer
{  
   public static void main(String[] args) throws IOException
   {  
      final int PORT = 7777;
      ServerSocket server = new ServerSocket(PORT);
      System.out.println("Waiting for clients to connect...");
      
      while (true)
      {
         Socket s = server.accept();
         System.out.println("Client connected.");
         OracleService service = new OracleService(s);
         Thread t = new Thread(service);
         t.start();
      }
   }
   
   public static void start()
   {
      class ServerRunnable implements Runnable
      {
         public void run() 
         { 
            try 
            { 
               OracleServer.main(null); 
            } 
            catch (IOException ex) 
            {}
         }
      }
      
      Runnable r = new ServerRunnable();
      Thread t = new Thread(r);
      t.setDaemon(true); // this thread will die if it is the only one left
      t.start(); // start up server in new thread
   }
}
