/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_5_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch15_5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestFunction func = ()->{
            System.out.println("MyFunc1");
        };
        func.test();
        TestFunction func2 = ()->System.out.println("MyFunc2");
         func2.test();
    }
    
}
