/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_6_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch15_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestFunction2 tf = (String v1) ->{
            System.out.println(v1);
        };
        tf.test("Hello!");
        
         TestFunction2 tf2 = v2 -> System.out.println(v2);
         tf2.test("你好");
    }
    
}
