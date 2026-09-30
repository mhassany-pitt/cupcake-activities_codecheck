/**
   Represents a dog.
*/
public class Dog implements Animal
{
   private String name;
   private String trick;

   public Dog(String aName, String aTrick)
   {
      name = aName;
      trick = aTrick;
   }
   
   public String getName() { return name; }
   
   public String getTrick() { return trick; }
}
