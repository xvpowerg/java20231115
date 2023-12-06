/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_3_exception3;

/**
 *
 * @author xvpow
 */
public class Test {
    public void testMyEx(boolean b1)
            throws TestException{
        if (b1){
             throw new TestException();
        }
       System.out.println("testMyEx Excepiton");
    }
    
    public void testRunTimeEx(boolean b1){
        if (b1){
            throw new TestRuntimeException();
        }
          System.out.println("testRunTimeEx Excepiton");
    }
}
