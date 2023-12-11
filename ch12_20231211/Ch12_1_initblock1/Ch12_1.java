/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20231211.Ch12_1_initblock1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestInit tinit = new TestInit();
       System.out.println(tinit.getMsg(5));
        TestInit tinit2 = new TestInit("V1");
         System.out.
                 println(tinit2.getMsg(5));
    }
    
}
