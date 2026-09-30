import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
   This class encrypts files using the HyperCaesar cipher.
*/
public class HyperCaesarCipher
{
   /**
      Constructs a cipher object with a given key.
      @param aKey the encryption key
   */
   public HyperCaesarCipher(int aKey)
   {
      key = (byte) aKey;
   }

   /**
      Encrypts the contents of a stream.
      @param in the input stream
      @param out the output stream
   */      
   public void encryptStream(InputStream in, OutputStream out)
         throws IOException
   {
      boolean done = false;
      while (!done)
      {
         int next = in.read();
         if (next == -1) done = true;
         else
         {
            byte b = (byte) next;
            byte c = encrypt(b);
            out.write(c);
         }
      }
   }

   /**
      Encrypts a byte.
      @param b the byte to encrypt
      @return the encrypted byte
   */
   public byte encrypt(byte b)
   {
      byte r = (byte) (b + key);
      key = (byte) (key + b);
      return r;
   }

   
   // TODO: Add decryption
   
   private byte key;
   
   // this method is used to check your work
   
   public static void main(String[] args)
   {  
      try
      {  
         InputStream inStream = new FileInputStream("encrypted.txt");
         OutputStream outStream = new FileOutputStream("decrypted.txt");
         int key = 3;
         HyperCaesarCipher cipher = new HyperCaesarCipher(key);
         cipher.decryptStream(inStream, outStream);

         inStream.close();
         outStream.close();
      }
      catch (IOException exception)
      {  
         System.out.println("Error processing file: " + exception);
      }
   }
}
