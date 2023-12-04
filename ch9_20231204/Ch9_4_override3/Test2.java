/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_4_override3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    @Override
    public int testInt(){
        return 25;
    }
    
    public Test2 testObj(){
        return new Test2();
    }
}
