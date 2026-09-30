import java.util.ArrayList;

public class NumberGuesser
{
   public NumberGuesser(int lowest, int highest)
   {
      low = lowest;
      high = highest;
   }

   /**
      Returns the next guess.
      @return a string of the form >n or =n
   */
   public String nextGuess()
   {
      // TODO: Complete method
   }
   
   /**
      Sets the response by the person who knows the number
      @param guessCorrect true if the preceding guess was correct
   */
   public void response(boolean guessCorrect)
   {
      // TODO: Complete method
   }
   
   private int low;
   private int mid;
   private int high;
   
   // this method is used to check your work
   public static String[] check(int n)
   {
      NumberGuesser guesser = new NumberGuesser(1, 100);
      ArrayList<String> guesses = new ArrayList<String>();
      while (true)
      {
         String guess = guesser.nextGuess();
         guesses.add(guess);
         System.out.println(guess);
         if (guess.startsWith("="))
            return guesses.toArray(new String[]{});
         int g = Integer.parseInt(guess.substring(1));
         guesser.response(n > g);
      }
   }   
}
