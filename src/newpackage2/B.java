/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage2;

import javaapplication4.A;
import static java.lang.Math.*;

/**
 *
 * @author aleksandr
 */
public class B extends A {

    public B() {
        super("const");
        abs(1.);
    }
    
    
    
    public static void stat(){
        System.out.println("hello stat B");
    }    

    @Override
    public void hello() {
//        super.hello(); 
        System.out.println("hello + B");
    }
    
    public void hello(String ... args){
        for(String s : args){
            System.out.println(""+s);
        }
    }

    public void hello(String args){
        
    }
    
    
    public static void main(String... args) {
        B b = new B();
        b.hello("test");
        
        class C{
            
        }
        
        C c = new C(){};
        C c2 = new C(){};
    }
    
    class C{
        
    }
    
}
