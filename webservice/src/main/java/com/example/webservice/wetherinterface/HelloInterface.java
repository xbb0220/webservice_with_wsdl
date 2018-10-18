package com.example.webservice.wetherinterface;


import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name = "HelloInterface", targetNamespace = "http://weatherinterface.webservice.excample.com/")
public interface HelloInterface {

    String  getCityWeather(@WebParam(name = "Name") String  name);
}
