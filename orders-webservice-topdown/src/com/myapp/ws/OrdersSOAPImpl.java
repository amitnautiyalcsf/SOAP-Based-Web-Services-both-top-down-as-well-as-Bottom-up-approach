
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.myapp.ws;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.myapp.ws.repository.OrderRepository;

/**
 * This class was generated by Apache CXF 3.3.2 2019-06-18T17:40:48.705+05:30
 * Generated source version: 3.3.2
 *
 */

@javax.jws.WebService(serviceName = "orders", portName = "ordersSOAP", targetNamespace = "http://myapp.com/orders/", wsdlLocation = "file:/C:/Users/training/Documents/workspace-sts-3.9.8.RELEASE/orders-webservice-topdown/WebContent/wsdl/orders.wsdl", endpointInterface = "com.myapp.ws.Orders")

public class OrdersSOAPImpl implements Orders {

	private OrderRepository orderRepository;

	public OrdersSOAPImpl() {
// TODO Auto-generated constructor stub

		orderRepository = new OrderRepository();

	}

	private static final Logger LOG = Logger.getLogger(OrdersSOAPImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.myapp.ws.Orders#search(com.myapp.ws.ProductNameWrapper productName)*
	 */

	public com.myapp.ws.OrderInfoWrapper search(ProductNameWrapper productName) {

		LOG.info("Executing operation search");

		System.out.println(productName);

		try {

			com.myapp.ws.OrderInfoWrapper _return = new com.myapp.ws.OrderInfoWrapper();

			_return.getOrder().addAll(

					orderRepository.searchRepository(productName.getProductName()));

			return _return;

		} catch (java.lang.Exception ex) {

			ex.printStackTrace();

			throw new RuntimeException(ex);

		}
	}

}