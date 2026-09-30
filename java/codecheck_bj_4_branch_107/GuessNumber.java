import java.util.Random;
/**
   A class to store a number to guess and return a closeness hint
*/
public class GuessNumber
{
   private int number;

   /**
      Construct an GuessNumber with a random value between 1 and 50
   */
   public GuessNumber()
   {
      Random r = new Random();
      number = r.nextInt(50) + 1;
   }
   
   /**
      Determine how close the guess is and return a hint
      @return a string describing, in terms of hotness or coldness, how
      close the guess is to the number
   */
   public String howClose(int guess)
   {
      // Implement this method, following the task description    
   
   
   }

   // Other methods for playing the game omitted--you need not supply any of them
   
   // This method is used to check your work
   
   public static String check(int number, int guess)
   {
      GuessNumber gn = new GuessNumber();
      gn.number = number;
      return gn.howClose(guess);
   }
}
