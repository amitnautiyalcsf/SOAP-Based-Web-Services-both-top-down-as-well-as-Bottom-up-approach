
package com.myapp.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-19T13:02:40.278+05:30
 * Generated source version: 3.3.2
 *
 */
public final class Orders_OrdersSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://myapp.com/orders/", "orders");

    private Orders_OrdersSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Orders_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Orders_Service ss = new Orders_Service(wsdlURL, SERVICE_NAME);
        Orders port = ss.getOrdersSOAP();

        {
        System.out.println("Invoking search...");
        com.myapp.ws.ProductNameWrapper _search_productName = new com.myapp.ws.ProductNameWrapper();
        _search_productName.setProductName("ProductName-303049611");
        com.myapp.ws.OrderInfoWrapper _search__return = port.search(_search_productName);
        System.out.println("search.result=" + _search__return);


        }

        System.exit(0);
    }

}
