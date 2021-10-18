/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlpractice;
        
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import javax.xml.validation.SchemaFactory;
import static javax.xml.XMLConstants.*;




public class XmlPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        File file = new File("G:\\J2EE\\Advance_JAVA\\xmlPractice\\src\\xmlFile.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        spf.setValidating(true);
        SAXParser parser = null;
        try{
        parser = spf.newSAXParser();
        xmlHandler handler = new xmlHandler();
        parser.parse(file, handler);

        }catch(ParserConfigurationException e){
        

        } catch (SAXException ex) {
            Logger.getLogger(XmlPractice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        
    }

}
