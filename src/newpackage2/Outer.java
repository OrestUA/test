/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage2;

/**
 * Класс такой-то для того-то. Пример использования.
 * <pre>
 * {@code 
 * <xml>
 * </xml>
 * }
 * </pre>
 * 
 * @author aleksandr
 * @see B
 */
public class Outer {
    
    private String field1 = "5";
    
    class InnerNonStatic{
        private String field1 = "15";
        
        /**
         * Что делает.
         * @param str String
         * @return что возвращает
         */
        public String ping(String str){
            //
            System.out.println(""+Outer.this.field1);
            return "";
        }
    }
    
    public static class InnerStatic{
        
    }
    
    
    public static void main(String[] args) {
        Outer.InnerNonStatic ref = new Outer().new InnerNonStatic();
        
        Outer.InnerStatic ref2 = new Outer.InnerStatic();
    }
    
}
