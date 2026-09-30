import java.util.Map;
import java.util.HashMap;

public class Matrix<T>
{
   public Matrix(int rows, int columns)
   {
      elements = new HashMap<Pair<Integer, Integer>, T>();
   }

   // add your get and put methods here

   private Map<Pair<Integer, Integer>, T> elements;

   // the following method is used to check your work

   public static String check(int r, int c, String s)
   {
      int rows = 3;
      int columns = 4;

      Matrix<String> m = new Matrix<String>(rows, columns);

      // add letters of s diagonally
      for (int i = 0; i < s.length(); i++)
      {
         m.put(r, c, s.substring(i, i + 1));
         r++; if (r >= rows) r = 0;
         c++; if (c >= columns) c = 0;
      }
   
      // make string representing matrix content
      String t = "";
      for (int i = 0; i < rows; i++)
         for (int j = 0; j < columns; j++)
            if (m.get(i, j) == null) 
               t += "."; 
            else 
               t += m.get(i, j);
      return t;
   }
}
