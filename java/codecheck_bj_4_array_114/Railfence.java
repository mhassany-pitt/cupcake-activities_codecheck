import java.util.ArrayList;

/**
   Encodes strings using the Railfence cipher.
*/
public class Railfence
{
   /**
      Arranges a message in a fence pattern
      @param message any string
      @return a two-dimensional array of strings that are either null (.) or strings
      of length 1, arranged in a pattern like this
      m . . . a . .
      . e . s . g .
      . . s . . . e
   */
   public String[][] makeFence(String message)
   {
      // your work here
      
      
      
      
      
      
      
      
      
      
      
   }
   
   
   // This message is used to check your work
   public String encode(String message)
   {
      String[][] fence = makeFence(message);
      String result = "";
      for (int i = 0; i < fence.length; i++)
        for (int j = 0; j < fence[i].length; j++)
          if (fence[i][j] != null && fence[i][j].length() == 1)
            result = result + fence[i][j];
      return result;
   }
}
