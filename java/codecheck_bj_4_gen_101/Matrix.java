import java.util.ArrayList;

public class Matrix<T>
{
   public Matrix(int rows, int columns)
   {
      this.rows = rows;
      this.columns = columns;
      elements = new ArrayList<ArrayList<T>>();
      for (int i = 0; i < rows; i++)
      {
         ArrayList<T> row = new ArrayList<T>();
         for (int j = 0; j < columns; j++)
            row.add(null);
         
         elements.add(row);
      }
   }

   // add your get and put methods here

   private ArrayList<ArrayList<T>> elements;
   private int rows;
   private int columns;

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
