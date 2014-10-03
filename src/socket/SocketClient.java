/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author user
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 1111);
        try (InputStreamReader ir = new InputStreamReader(System.in);
                BufferedReader r = new BufferedReader(ir);
                OutputStreamWriter ow = new OutputStreamWriter(s.getOutputStream());
                BufferedWriter br = new BufferedWriter(ow)) {
            String line;
            while ((line = r.readLine()) != null) {
                br.write(line);
                br.newLine();
                br.flush();
            }
        }
        s.close();
    }

}
