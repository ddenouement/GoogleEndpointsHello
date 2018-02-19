package com.google.training.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

 
@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
       clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
       description = "API for hello world endpoints.")

public class HelloWorldEndpoints {

  // Declare this method as a method available externally through Endpoints
   @ApiMethod(name = "sayHello", path = "sayHello",
           httpMethod = HttpMethod.GET)

   public HelloClass sayHello() {
       return new HelloClass();
   }

   // Declare this method as a method available externally through Endpoints
   @ApiMethod(name = "sayHelloByName", path = "sayHelloByName",
           httpMethod = HttpMethod.GET)

   public HelloClass sayHelloByName (@Named("name") String name) {
       return new HelloClass(name);
   }

// Declare this method as a method available externally through Endpoints
   @ApiMethod(name = "sayBySurname", path = "sayBySurname",
           httpMethod = HttpMethod.GET)

   public HelloClass sayBySurname (@Named("name") String name, @Named("surname") String s) {
       return new HelloClass(name, s);
   }
}