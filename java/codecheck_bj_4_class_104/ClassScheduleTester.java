public class ClassScheduleTester
{
   public static void main(String[] args)
   {
      ClassSchedule class1 = new ClassSchedule("Intro to Java","MWF","9:00", "9:50","Turing 101");
      System.out.println(class1.getTitle() +
         " meets " + class1.getTime() + " in " + class1.getRoom() );
      System.out.println("Expected: Intro to Java meets MWF 9:00-9:50 in Turing 101");
                
      ClassSchedule class2 = new ClassSchedule("Operating Systems","TT","12:30","1:45","Turing 307"); 
      System.out.println(class2.getTitle() +
         " meets " + class2.getTime() + " in " + class2.getRoom() );
      System.out.println("Expected: Operating Systems meets TT 12:30-1:45 in Turing 307");
   }
}
