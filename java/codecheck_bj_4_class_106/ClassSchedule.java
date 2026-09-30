/**
   A class has a title, time and room
*/
public class ClassSchedule
{  
   private String title;
   private String days;
   private String startTime;
   private String endTime;
   private String room;

   /**
      Constructs a class with title, day, time and room.
   */
   public ClassSchedule(String classTitle, String meetingDays, String aStartTime, String aEndTime, String classRoom)
   {   
     title = classTitle;
     days = meetingDays;
     startTime = aStartTime;
     endTime = aEndTime;
     room = classRoom;
   }

   /**
      Gets the title.
      @return the title
   */
   public String getTitle()
   {   
      return title;
   }

   /**
      Gets the time in the form "days start time-end time".
      @return the time
   */
   public String getTime()
   {   
      String time = days + " " + startTime + "-" + endTime;
      return time;
   }

   /**
      Gets the room.
      @return the room
   */
   public String getRoom()
   {   
      return room;
   }

   /**
      Sets the days.
   */
   public void setDays(String meetingDays)
   {   
      days = meetingDays;

   }
   
   /**
      Sets the start time.
   */
   public void setStartTime(String aStartTime)
   {   
      startTime = aStartTime;
   }

   /**
      Sets the end time.
   */
   public void setEndTime(String aEndTime)
   {   
      endTime = aEndTime;
   }
}
