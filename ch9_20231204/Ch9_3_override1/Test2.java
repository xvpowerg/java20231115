/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_3_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    @Override //檢查方法是否為正確的Override
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
    @Override
    protected void testProtected(){//protected public
         System.out.println("Test2 testProtected");
    }
    @Override
    void testDefault(){//default protected public
        System.out.println("Test2 testDefault");
    }
   // @Override
    private void testPrivate(){//無法複寫
         System.out.println("Test2 testPrivate");
    }
}
