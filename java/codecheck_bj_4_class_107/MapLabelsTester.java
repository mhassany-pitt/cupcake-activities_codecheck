public class MapLabelsTester
{
   public static void main(String[] args)
   {
       MapLabels label1 = new MapLabels("Atlanta, GA", 33.755, -84.39);
       System.out.println(label1.toString());
       System.out.println("Expected: <label name=\"Atlanta, GA\" latitude=\"33.755\" longitude=\"-84.39\"/>");

       MapLabels label2 = new MapLabels("San Francisco, CA", 37.7793, -122.4192);       
       System.out.println(label2.toString());
       System.out.println("Expected: <label name=\"San Francisco, CA\" latitude=\"37.7793\" longitude=\"-122.4192\"/>");
   }
}
