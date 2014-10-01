/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author aleksandr
 */
public class A {
    
    protected String name;

    /**
     *  {@link newpackage2.B#hello(java.lang.String...) }
     * @param name 
     */
    public A(String name) {
        this.name = name;
    }
    
    
    
    public void hello(){
        System.out.println("hello from A");
    }
    
    public static void stat() throws IOException{
        System.out.println("hello stat");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        
        while((line=br.readLine())!=null){
            System.out.println(""+line);
        }
        
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        Console c = System.console();
        
    }

}


