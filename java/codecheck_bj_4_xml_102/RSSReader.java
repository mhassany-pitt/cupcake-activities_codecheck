import java.io.File;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException; 

public class RSSReader
{
   public int countItems(Document doc) throws XPathExpressionException      
   {
      . . .
   }
   
   // this method is used to check your work
   
   public int check(String what) 
      throws ParserConfigurationException, SAXException, 
      IOException, XPathExpressionException
   {
      XPathFactory xpfactory = XPathFactory.newInstance();
      path = xpfactory.newXPath();
      DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = dbfactory.newDocumentBuilder();
      Document doc;
      if (what.startsWith("<")) 
      {
         doc = builder.parse(new ByteArrayInputStream(what.getBytes())); 
      }
      else
      {
         doc = builder.parse(new File(what));
      }       
      return countItems(doc);
   }
   
   private XPath path;
}
