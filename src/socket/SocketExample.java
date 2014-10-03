/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SocketExample {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1111);
        while(true){
            Socket s = ss.accept();
            System.out.println(""+s.getPort());
            new SocketWorker(s).start();
        }
        //ss.close();
    }
    
    static class SocketWorker extends Thread{
        private final Socket s;

        public SocketWorker(Socket s) {
            this.s = s;
        }

        @Override
        public void run() {
            try(InputStreamReader ir = new InputStreamReader(s.getInputStream(), "UTF-8"); 
                    BufferedReader br = new BufferedReader(ir)){
                String line;
                while((line=br.readLine())!=null){
                    System.out.println(""+line);
                }
            } catch (IOException ex) {
                Logger.getLogger(SocketExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    
}
