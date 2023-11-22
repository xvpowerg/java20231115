/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

    static int test(int n){
        if(n<=1 )
            return 1;
        return n * test(n-1);
    }
    public static void main(String[] args) {
        //5! = 5 * 4 * 3 * 2 * 1
        System.out.println(test(6));
    }
    
}
