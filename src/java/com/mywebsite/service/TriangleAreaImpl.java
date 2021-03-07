/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.service;

import com.mywebsite.interfaces.LuasSegitiga;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(endpointInterface = "com.mywebsite.interfaces.LuasSegitiga")
public class TriangleAreaImpl implements LuasSegitiga {

    /**
     * This is a sample web service operation
     */
    @Override
    public double getArea(@WebParam(name = "base") int base ,@WebParam(name="height") int height ){
        return 0.5 *(base*height);
    }
    
    
}
