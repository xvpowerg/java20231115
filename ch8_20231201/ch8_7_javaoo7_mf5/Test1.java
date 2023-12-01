/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20231201.ch8_7_javaoo7_mf5;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(int v){
        System.out.println("public Test1");
    }
    protected Test1(float f2){
         System.out.println("protected Test1(float f2)");
    }
    Test1(String msg){
       System.out.println("default  Test1(String msg)");  
    }
    private Test1(boolean b1){
          System.out.println("private Test1(boolean b1)");  
    }
}
