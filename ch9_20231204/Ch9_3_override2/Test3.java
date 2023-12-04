/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_3_override2;
import ch9_20231204.Ch9_3_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1{
    @Override
    public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    @Override
    protected void testProtected(){
         System.out.println("Test3 testProtected");
    }
   // @Override
    //跨Package無法複寫default
    void testDefault(){
           System.out.println("Test3 testDefault");
    }
   
}
