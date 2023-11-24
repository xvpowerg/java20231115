/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    static void test1(int v1,int v2){
        System.out.println("Test1 int int");
    }
    static void test1(int v1,float v2){
        System.out.println("Test1 int float");
    }
    static void test2(int v1,Integer v2){
        System.out.println("int Integer");
    }
    
    static void test2(Integer v1,int v2){
        System.out.println("Integer int");
    }
           
    public static void main(String[] args) {
       
        test1(10,20);
        test1(10,20f);
        //test2(10,20);
    }
    
}
