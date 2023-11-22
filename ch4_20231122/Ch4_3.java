/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;


public class Ch4_3 {
    static void test(int r){
        System.out.println("Start:"+r);
        if (r < 3){
           test(1 + r);   
        }
        System.out.println("End:"+r);
    }
    public static void main(String[] args) {
        test(1);
       
    }
    
}
