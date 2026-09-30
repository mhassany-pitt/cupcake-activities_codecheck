import java.io.File;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException; 

public class XMLReader
{
   public Document read(String what)
      throws . . .
   {
      . . .
      if (what.startsWith("<")) 
      {
         . . . 
      }
      else
      {
         FileInputStream in = new FileInputStream(...);
         . . .
      }         
   }
   
   // This method is used to check your work.
   
   public String check(String what) throws Exception
   {
      return read(what).getDocumentElement().getNodeName();
   }
}
