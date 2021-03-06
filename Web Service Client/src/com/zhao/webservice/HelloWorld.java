
package com.zhao.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://webService.zhao.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "say", targetNamespace = "http://webService.zhao.com/", className = "com.zhao.webservice.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://webService.zhao.com/", className = "com.zhao.webservice.SayResponse")
    @Action(input = "http://webService.zhao.com/HelloWorld/sayRequest", output = "http://webService.zhao.com/HelloWorld/sayResponse")
    public void say(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
