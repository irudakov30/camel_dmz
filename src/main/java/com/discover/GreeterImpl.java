package com.discover;

import javax.jws.WebService;

@WebService(endpointInterface = "com.discover.Greeter")
public class GreeterImpl implements Greeter {
    @Override
    public Response hello(String message) {
        System.out.println(">>>>>>>>>>>>>> " + message);
        return new Response(message);
    }
}
