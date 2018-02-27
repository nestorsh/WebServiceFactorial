/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ulpgc.factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "num") int num) {
        if(num==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }



    
}
