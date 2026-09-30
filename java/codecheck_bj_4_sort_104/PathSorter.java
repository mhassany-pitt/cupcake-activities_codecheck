import java.util.Arrays;
import java.util.Comparator;

public class PathSorter
{
   public String[] sort(String[] paths)
   {
      class PathComparator implements Comparator<String>
      {
         public int compare(String p1, String p2)
         {
            // TODO: Complete this method
         }
         
         private int countSlashes(String p)
         {
            return p.length() - p.replace("/", "").length();
         }
      }      
      
      Arrays.sort(paths, new PathComparator());
      return paths;
   }   
}
