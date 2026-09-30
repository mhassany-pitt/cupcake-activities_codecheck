/**
   This class is the representation of a polygon.
   In order to be a full polygon, the end point must be the same as
   the original start point.
*/
public class Polygon
{
   private Point[] pnts; //stores the points that make up this polygon
   private int curPoint; //stores the current point to be added
   
   public Polygon(int numPoints)
   {
      pnts = new Point[numPoints];
   }
   
   /**
      Adds a point as a new vertex of the polygon.
      @param p a Point object representing a new vertex
   */
   public void addPoint(Point p)
   {
      pnts[curPoint] = p;
      curPoint++;
   }
   
   /**
      Returns the number of elements in the polygon's pnts array
      @return size of the pnts array
   */
   private int getSize()
   {
      return pnts.length;
   }
   
   /**
      Lists the coordinates of the vertices of the polygon
      @return list of coordinates
   */
   public String listVertices()
   {
      String pointList = "";
      for (int i = 0; i < getSize(); i++)
      {
         pointList = pointList + "(" + pnts[i].getX()
            + "," + pnts[i].getY() + ") ";
      }
      return pointList;
   }
}
