/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20231201.ch8_2_javaoo2;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    Test2(){
        this(10);
        System.out.println("Test2()");
    }
    Test2(int id){
        //在所有無this()或super()的建構式都會自行補上super()
        System.out.println("Test2(int id)");
    }
}
