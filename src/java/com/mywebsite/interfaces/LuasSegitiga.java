/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.interfaces;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService
public interface LuasSegitiga {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getArea")
    public double getArea(@WebParam(name = "base") int base ,@WebParam(name="height") int height ) ;
}
