import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
   This class encrypts files using the SuperCaesar cipher.
*/
public class SuperCaesarCipher
{
   /**
      Constructs a cipher object with a given key.
      @param aKey the encryption key
   */
   public SuperCaesarCipher(int aKey)
   {
      key = aKey;
   }

   /**
      Encrypts or decrypts the contents of a stream.
      @param in the input stream
      @param out the output stream
      @param decrypt true to decrypt, false to encrypt
   */      
   public void processStream(InputStream in, OutputStream out, boolean decrypt)
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
            byte c;
            if (decrypt)
               c = decrypt(b);
            else
               c = encrypt(b);
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
      // your work here
   }

   /**
      Decrypts a byte.
      @param b the byte to decrypt
      @return the decrypted byte
   */
   public byte decrypt(byte b)
   {
      // your work here
   }

   private int key;
   
   // this method is used to check your work
   
   public static String check(String input, int key, boolean decrypt)
   {
      try
      {
         InputStream inStream = new ByteArrayInputStream(input.getBytes());
         ByteArrayOutputStream outStream = new ByteArrayOutputStream();

         SuperCaesarCipher cipher = new SuperCaesarCipher(key);
         cipher.processStream(inStream, outStream, decrypt);

         inStream.close();
         outStream.close();
         return outStream.toString();
      }
      catch (IOException exception)
      {  
         return "Error";
      }      
   }   
}
