/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_7_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch15_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestFunction3 tf1 = (int v1,String v2) ->{
        
                return v1 + v2;
        };
        String result = tf1.test(10, "cm");
        System.out.println(result);
        
        TestFunction3 tf2 = (v1,v2)->v1+v2;
        String result2 = tf2.test(72, "kg");
       System.out.println(result2);  
    }
    
}
