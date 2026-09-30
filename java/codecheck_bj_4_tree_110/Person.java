import java.util.Set;
import java.util.TreeSet;

public class Person 
{
   private String firstName;
   private String lastName;

   public Person(String firstName, String lastName) 
   {
      this.firstName = firstName;
      this.lastName = lastName; 
   }

   public String toString()
   {
      return lastName + "/" + firstName;
   }
      
   // This method is used to check your work
   
   public static Set<String> check(String[] names)
   {
      Set<String> result = new TreeSet<String>();
      for (int i = 0; i < names.length; i += 2)
      {
         Person p = new Person(names[i], names[i + 1]);
         result.add(p.toString());
      }
      return result;
   }   
}
