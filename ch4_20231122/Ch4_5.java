/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {
    //多參數 
    //位置限制只能是最後一個
    static int sum(int... a1){
        int result = 0;
        for(int v : a1){
            result += v;
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sum(5,2));
         System.out.println(sum(5,2,6));
         System.out.println(sum(5,2,6,7));
         System.out.println(sum());
    }
    
}
