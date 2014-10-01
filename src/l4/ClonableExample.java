/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package l4;

/**
 *
 * @author aleksandr
 */
public class ClonableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u = new User();
        
        u.setFio("ytytuytuy");
        u.setId(5);
        u.setPassword("1111");
        
        User u2 = (User) u.clone();
        u2.setPassword("12345");
        System.out.println(""+u);
        System.out.println(""+u2);
    }
}
