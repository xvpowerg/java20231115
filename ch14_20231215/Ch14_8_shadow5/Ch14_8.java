/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_8_shadow5;

/**
 *
 * @author xvpow
 */
public class Ch14_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t2 = new Test2();
        t2.setMsg1("MyMsge1");
        t2.setMsg2("MySage2");
        System.out.println(t2.getMsg1());
        System.out.println(t2.getMsg2());
        
        
        Test2 t2_2 = new Test2();
        t2_2.setMsg1("MyMsge1");
        t2_2.setMsg2("MySage2");
        System.out.println(t2_2.getMsg1());
        System.out.println(t2_2.getMsg2());
        
    }
    
}
