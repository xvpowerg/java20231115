/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_3_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    /*
    public 最公開
    protected
    default
    private 最不公開
    */
    public void testPublic(){
        System.out.println("Test1 testPublic");
    }
    protected void testProtected(){
        System.out.println("Test1 testProtected");
    }
    void testDefault(){
        System.out.println("Test1 testDefault");
    }
    private void testPrivate(){
          System.out.println("Test1 testDefault");
    }
}
