/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {
    //call by value
   static void test1(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
   }
   
   
    public static void main(String[] args) {
       
     int a = 10;
     int b = 20;
     System.out.println(a+":"+b);
     test1(a,b);   
     System.out.println(a+":"+b);
        
        
    }
    
}
