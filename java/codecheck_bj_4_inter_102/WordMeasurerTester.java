/**
   This program tests the WordMeasurer class.
*/
public class WordMeasurerTester
{
   public static void main(String[] args)
   {
      DataSet data = new DataSet(new WordMeasurer());

      data.add(new Word("Java"));
      data.add(new Word("is"));
      data.add(new Word("an"));
      data.add(new Word("object"));
      data.add(new Word("oriented"));
      data.add(new Word("programming"));
      data.add(new Word("language"));

      System.out.println("Average measure: " 
            + data.getAverage());
      System.out.println("Expected: 2.0");
   }
}
