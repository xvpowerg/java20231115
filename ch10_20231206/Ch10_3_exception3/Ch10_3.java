/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20231206.Ch10_3_exception3;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test t1 = new Test();
       try{
              t1.testMyEx(true);
       }catch(TestException ex){
           System.out.println(ex);
       }
       
       try{
           t1.testRunTimeEx(false);
       }catch(TestRuntimeException ex){
           System.out.println(ex);
       }
       
    
        
        
    }
    
}
