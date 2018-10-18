package com.example.webservice.config;


import javax.xml.ws.Endpoint;

import com.example.webservice.wetherinterface.HelloInterface;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class CxfConfig {

    @Bean
   public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }

    @Autowired
    private SpringBus bus;

    @Autowired
    HelloInterface helloInterface;

    /** JAX-WS **/
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloInterface);
        endpoint.publish("/ServiceMethod");
        return endpoint;
    }
}
