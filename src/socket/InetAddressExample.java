/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author user
 */
public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        URL u = new URL("http://local");
        //u.
    }
}
