/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    //多載 Overloading 方法名稱一樣 參數數量或類型不一樣
    static void test1(int a){
        System.out.println("Test1:"+a);
    }
    static void test1(int a,int b){
        System.out.println("Test1:"+a+":"+b);
    }
    static void test2(String v1){
        System.out.println("String:"+v1);
    }
    static void test2(int v1){
         System.out.println("int:"+v1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        test2("A");
        test2(10);
       
        test1(10);
        test1(15,22);
        
   
    }
    
}
