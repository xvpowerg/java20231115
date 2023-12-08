/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20231208.ch11_4_static1;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test1("Msg1","A");
        Test1 t2 = new Test1("Msg2","B");
        t1.setMsg2("X");

        System.out.println(t1.getMsg2());
        Test1.setMsg2("Y");
        System.out.println(t2);
        System.out.println(Test1.getMsg2());
        
    }
    
}
