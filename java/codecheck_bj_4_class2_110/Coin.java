/**
   A coin with a monetary value.
*/

/*
   TODO: Add a static variable that maintains the total value of coin objects
   that have been constructed. Add a static method totalValue that
   reports the total value.
*/

public class Coin
{
   private double value;
   private String name;
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName)
   {
      value = aValue;
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue()
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Returns a string representation of the object.
      @return name and value of coin
   */
   public String toString()
   {
      return "Coin[value=" + value + ",name=" + name + "]";
   }

   public static double check(int dimes, int quarters)
   {
      Coin[] coins = new Coin[dimes + quarters];
      for (int i = 1; i <= dimes; i++)
      {
         coins[i] = new Coin(0.10, "dime");
      }
      for (int i = 1; i <= quarters; i++)
      {
         coins[dimes] = new Coin(0.25, "quarter");
      }
      return Coin.totalValue();
   }
}
