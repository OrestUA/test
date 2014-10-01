/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package l4;

import java.io.File;
import java.util.Date;

/**
 *
 * @author aleksandr
 */
public class FileExample {
    public static void main(String[] args) {
        
        File f = new File("");
        
        System.out.println(""+f.getAbsolutePath()+"|"+new Date(f.lastModified())+"|");
        System.out.println(""+System.getProperty("user.dir"));
        
        File[] fs = new File(f.getAbsolutePath()).listFiles();
        for(File f1 : fs){
            System.out.println(""+f1.getName());
        }
    }
}
