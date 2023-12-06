/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20231206.Ch10_4_override_ex1;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Test1 t1 = new Test1();
            t1.testEx(true);
        }catch(MyException ex){
            System.out.println(ex);
        }
    }
    
}
