package com.hello;

import jakarta.servlet.http.HttpServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.reactive.TomcatHttpHandlerAdapter;

public class HelloSpringApplication {

    private static final Logger logger = LoggerFactory.getLogger("");
    public static void main(String[] args) throws LifecycleException {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanProviderConfig.class);
//        boolean existsClassBean = applicationContext.containsBean("Customer");
//        if (existsClassBean) {
//            System.out.println("Class bean " + applicationContext.getBean(AnnotatedCustomer.class));
//        }

//         This is for annotation config
//        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("META-INF/beanProviderConfig.xml");
//        boolean existsXMLBean = xmlApplicationContext.containsBean("defaultCustomer");
//        if (existsXMLBean) {
//            System.out.println("XML bean " +xmlApplicationContext.getBean("dummyCustomer"));
//        }

//        This is for component scam
//        ApplicationContext xmlAppContext = new ClassPathXmlApplicationContext("META-INF/beanProviderConfig.xml");
//        Customer customer = xmlAppContext.getBean(Customer.class);
//        System.out.println(customer);

//        web project related code
//          Tomcat tomcat = new Tomcat();
//          Context context = tomcat.addContext("/", null);
//          tomcat.addServlet(context, "default", new DefaultServlet());
//          context.addServletMappingDecoded("/", "default");
//          tomcat.setPort(8080);
//          tomcat.start();

    }
}
