/**
   A computer class has a title, time and room
*/
public class ClassSchedule
{  
   private String title;
   private String days;
   private String startTime;
   private String endTime;
   private String room;

   /**
      Constructs a computer class with title, days, time and room
   */
   public ClassSchedule(String classTitle, String meetingDays, String aStartTime, String anEndTime, String classRoom)
   {   
     // your work here
     title = ...;
     days = ...;
     ...     
   }

   /**
      Gets the title
      @return the title
   */
   public String getTitle()
   {   
      // your work here
      
   }
   
   /**
      Gets the time in the form "days start time-end time"
      @return the time
   */
   public String getTime()
   {   
      // your work here
      String time = ...;
      return time;
   }
   
   /**
      Gets the room
      @return the room
   */
   public String getRoom()
   {   
      // your work here

   }
}
