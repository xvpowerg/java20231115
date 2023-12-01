/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20231201.ch8_4_javaoo4;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
   Test2(String msg){
       this(10,"");
       System.out.println("Test2(String msg)");
   } 
   
   Test2(int id,String msg){
       System.out.println("Test2(int id,String msg)");
   }
}
