/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_4_override_ex1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testEx(boolean b)throws MyException{
        if(b){
            throw new MyException("我的例外");
        }
    }
}
