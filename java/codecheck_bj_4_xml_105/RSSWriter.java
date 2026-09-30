import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException; 

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;


public class RSSWriter
{    
   /**
      Builds an RSS document with a single item
      @param title the title of the item
      @param link the link of the item
      @param description the description of the item
      @return an RSS document with a single item
   */
   public Document build(String title, String link, String description)
   {
      doc = builder.newDocument();
      Element rss = doc.createElement("rss");
      doc.appendChild(rss);
      rss.setAttribute("version", "2.0");
      Element channel = doc.createElement("channel");
      rss.appendChild(channel);
      channel.appendChild(createItem(title, link, description));
      return doc;
   }

   /**
      Builds a DOM element for an RSS item.
      @param title the title
      @param link the link
      @param description the description
      @return a DOM element describing the item
   */
   private Element createItem(String title, String link, String description)
   {
      . . .
   }

   private Element createTextElement(String name, String text)
   {
      Text t = doc.createTextNode(text);
      Element e = doc.createElement(name);
      e.appendChild(t);
      return e;
   }
  
   // this method is used to check your work
   
   public String check(String title, String link, String description, String xpathExpr) 
      throws Exception 
   {
      DocumentBuilderFactory dbfactory
         = DocumentBuilderFactory.newInstance();
      builder = dbfactory.newDocumentBuilder();
      XPathFactory xpfactory = XPathFactory.newInstance();
      XPath path = xpfactory.newXPath();
      Document doc = build(title, link, description);
      
      DOMImplementation impl = doc.getImplementation();
      DOMImplementationLS implLS 
            = (DOMImplementationLS) impl.getFeature("LS", "3.0");
      LSSerializer ser = implLS.createLSSerializer();
      String out = ser.writeToString(doc);      
      // return out;
      return path.evaluate(xpathExpr, doc);       
   }
   
   private DocumentBuilder builder;
   private Document doc;
}
