/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author aleksandr
 */
public class HelloWorld {
    
    public static final String HELLO_WORLD = "Hello World!";
    
    private int field1;
    
    {
        field1  = 111;
        for(int i =0;i<10;i++){
            field1+=i;
        }
    }

    public int getField1() {
        return field1;
    }

    public HelloWorld(int field1) {
        this.field1 = field1;
    }

    public HelloWorld() {
        this(5);
        
    }
    
    public void init(){
        final int i;
        i=5;
        System.out.println(""+i);
    }

    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HelloWorld hw = new HelloWorld();
        System.out.println(""+hw.field1);
        System.out.println(""+HelloWorld.HELLO_WORLD);
    }
    
}
