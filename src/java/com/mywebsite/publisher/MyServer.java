/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.publisher;
import javax.xml.ws.Endpoint;
import com.mywebsite.service.TriangleAreaImpl;

/**
 *
 * @author ASUS
 */
public class MyServer {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:83/luas_segitiga", new TriangleAreaImpl());
    }
}
