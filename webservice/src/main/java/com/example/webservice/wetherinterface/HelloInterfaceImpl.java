package com.example.webservice.wetherinterface;


import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "HelloInterface", // 与接口中指定的name一致
        targetNamespace = "http://weatherinterface.webservice.excample.com/",
        endpointInterface = "com.example.webservice.wetherinterface.HelloInterface"// 接口地址
)
@Component
public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public String getCityWeather(String name) {

        return "Hello"+name;
    }
}
