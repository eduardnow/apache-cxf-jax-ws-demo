
package com.dojo.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dojo.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

