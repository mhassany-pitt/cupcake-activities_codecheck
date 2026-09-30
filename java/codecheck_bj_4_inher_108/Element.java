import java.util.ArrayList;

/**
   Element enumeration defines elements, their symbols, and their melting points.
*/

public enum Element
{
   // TODO: Define enumerated values for each entry in the table

   private String symbol;
   private double meltingPoint;

   // TODO: Complete the constructor
   Element (String aSymbol, double aMeltingPoint)
   {


   }

   public double getMeltingPoint()
   {
      return meltingPoint;
   }

   public String toString()
   {
      return symbol;
   }
   
   //TODO: complete the getMeltedElements method.
   /**
      Returns a list of elements whose melting points
      are less than or equal to a given temperature.
      @param boundaryTemp the cutoff temperature value
      @return a list of elements that will melt at the boundary temperature
   */
   public static ArrayList<Element> getMeltedElements(double boundaryTemp)
   {

   }   
}
