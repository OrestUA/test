/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UdpExample {
    public static void main(String[] args) throws SocketException, IOException {
        
        new Thread(){

            @Override
            public void run() {
                try {
                    DatagramSocket s = new DatagramSocket(5777);
                    for(int i=0;i<100;i++){
                        
                        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
                        s.receive(dp);
                        System.out.println(""+new String(dp.getData()));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(UdpExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }.start();
        
        DatagramSocket s = new DatagramSocket( );
        for(int i=0; i<100; i++){
            byte[] buf = ("ping "+i).getBytes();
            s.send(new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 5777));
        }
    }
}
