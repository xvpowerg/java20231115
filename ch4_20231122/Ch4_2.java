/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    static int power(int x){
       int result = x * x;
       return result;
    }
    static void testReturn(int x){
        if (x > 5){
            System.out.println("我Rreturn了");
            return;
        }
        System.out.println("我沒有Return:"+x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int v = power(2);
        System.out.println(v);
        testReturn(2);
         testReturn(6);
    }
    
}
