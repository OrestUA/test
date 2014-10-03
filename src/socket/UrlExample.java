/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author user
 */
public class UrlExample {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u = new URL("http://localhost:8084/WebApplication3/test1.jsp");
        HttpURLConnection con = (HttpURLConnection) u.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setConnectTimeout(2000);
        con.setReadTimeout(2000);
        
        String str = "p1="+URLEncoder.encode("ыыы&", "utf-8")+"&p2=yyy";
        System.out.println(""+str);
        try (OutputStream os = con.getOutputStream()) {
            os.write(str.getBytes("utf-8"));
        }
        System.out.println(""+con.getResponseCode()+"|"+con.getResponseMessage());
        InputStream is = con.getResponseCode()<400?con.getInputStream():con.getErrorStream();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(""+line);
            }
        }
    }
}
