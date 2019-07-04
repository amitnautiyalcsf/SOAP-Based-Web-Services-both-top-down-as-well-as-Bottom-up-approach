
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDate;

public class Adapter1
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (com.myapp.ws.converter.DateConverter.parse(value));
    }

    public String marshal(LocalDate value) {
        return (com.myapp.ws.converter.DateConverter.print(value));
    }

}
