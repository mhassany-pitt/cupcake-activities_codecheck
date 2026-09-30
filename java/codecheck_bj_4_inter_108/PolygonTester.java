/**
   This class creates a polygon object to test the Polygon class.
*/
public class PolygonTester
{  
   public static void main(String[] args)
   {
      PolygonTester PolyTest = new PolygonTester();
      System.out.println(PolyTest.testPolygon());
      System.out.println("Expected: (0,0) (0,10) (10,15)"
         + " (15,10) (10,0) (0,0) ");
   }
   
   /**
      Creates a polygon and returns a list of the vertices' coordinates
      @return list of vertics' coordinates
   */
   private String testPolygon()
   {
      // TODO: Clean up this code by using
      // anonymous objects where possible.
      Polygon poly = new Polygon(6);
      Point startPoint = new Point (0,0);
      poly.addPoint(startPoint);
      Point secondPoint = new Point(0,10);
      poly.addPoint(secondPoint);
      Point thirdPoint = new Point(10,15);
      poly.addPoint(thirdPoint);
      Point fourthPoint = new Point(15,10);
      poly.addPoint(fourthPoint);
      Point fifthPoint = new Point (10,0);
      poly.addPoint(fifthPoint);
      poly.addPoint(startPoint);
      return poly.listVertices();
   }
}
