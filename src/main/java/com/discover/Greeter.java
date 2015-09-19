package com.discover;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.javacodegeeks.com/product-service", name = "Greeter")
public interface Greeter {

    @WebMethod
    @WebResult
    Response hello(@WebParam(partName = "request", name = "message", targetNamespace = "http://ws.javacodegeeks.com/product-service/types") String message);
}
