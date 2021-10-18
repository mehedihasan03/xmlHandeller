/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlpractice;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;





/**
 *
 * @author 88016
 */
public class xmlHandler extends DefaultHandler{

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
         //To change body of generated methods, choose Tools | Templates.
          int count = atrbts.getLength();
          //System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(atrbts.getQName(i));
            System.out.println(atrbts.getValue(i));
    }

   

    
    }
    
    
}
