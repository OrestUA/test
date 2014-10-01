/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package l4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 *
 * @author aleksandr
 */
public class NewClass {
    public static void main(String[] args) {
        String str = "123456";
        str+="111"+"22223";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("11").append("222"+"11111");
        
        StringTokenizer st = new StringTokenizer("мама мыла раму, а шура - шары", " -,");
        while(st.hasMoreElements()){
            System.out.println(""+st.nextToken());
        }
        System.out.println(""+Arrays.toString("мама.мыла.раму.а.шура.шары".split("[.]")));
        System.out.println(""+str);
        System.out.println(String.format("%d %s",5,"22"));
        
        System.out.println(MessageFormat.format("{0} {1, number} {0}", "test1", 5));
    }
}
