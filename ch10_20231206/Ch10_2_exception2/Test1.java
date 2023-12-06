/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_2_exception2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testEx(int v){
        if (v >10){
            throw new RuntimeException();
        }
    }
    
    public void clear(){
        System.out.println("clear!!");
    }
}
