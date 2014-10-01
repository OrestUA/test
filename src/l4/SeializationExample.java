/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package l4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author aleksandr
 */
public class SeializationExample {
    public static void main(String[] args) throws Exception {
        User u = new User();
        
        u.setFio("ytytuytuy");
        u.setId(5);
        u.setPassword("1111");
        
        try(FileOutputStream f = new FileOutputStream("d:\\1.ser"); ObjectOutputStream oos = new ObjectOutputStream(f)){
            oos.writeObject(u);
        }
        
        try(FileInputStream f = new FileInputStream("d:\\1.ser"); ObjectInputStream oos = new ObjectInputStream(f)){
            User u2 = (User) oos.readObject();
            System.out.println(""+u2);
        }
            
    }
}
