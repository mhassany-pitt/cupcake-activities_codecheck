public class Player
{
   private String name;
   private String position;

   public Player(String aName, String aPosition)
   {
      name = aName;
      position = aPosition;
   }
   public String getName()
   {
      return name;
   }
   public String getPosition()
   {
      return position;
   }
   public String toString() 
   {
      return name + "-" + position;
   }
}
