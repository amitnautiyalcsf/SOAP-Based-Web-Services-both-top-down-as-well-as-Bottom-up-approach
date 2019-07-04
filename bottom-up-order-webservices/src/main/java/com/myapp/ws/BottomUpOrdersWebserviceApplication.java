package com.myapp.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@SpringBootApplication
public class BottomUpOrdersWebserviceApplication extends WsConfigurerAdapter{

@Bean
public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
MessageDispatcherServlet servlet = new MessageDispatcherServlet();
servlet.setApplicationContext(applicationContext);
servlet.setTransformWsdlLocations(true);
return new ServletRegistrationBean<>(servlet, "/services/*");
}

@Bean(name = "orders")
@Autowired
public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema ordersSchema) {
DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
wsdl11Definition.setPortTypeName("OrdersSoap");
wsdl11Definition.setLocationUri("/services");
wsdl11Definition.setTargetNamespace("http://myapp.com/orders/");
wsdl11Definition.setSchema(ordersSchema);
return wsdl11Definition;
}

@Bean
public XsdSchema ordersSchema() {
return new SimpleXsdSchema(new ClassPathResource("schema/orders.xsd"));
}


public static void main(String[] args) {
SpringApplication.run(BottomUpOrdersWebserviceApplication.class, args);
}

}
