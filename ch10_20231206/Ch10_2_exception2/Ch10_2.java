/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20231206.Ch10_2_exception2;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {
    public static int test(boolean b1){
        
        try{
            if (b1){
                return 10;    
            } 
        }finally{
           System.out.println("Test Ch10_2");
        }
      
        
       
        return 20;
    }
    public static void main(String[] args) {
          Test1 t1  = new Test1();
      try{
          t1.testEx(12);
      }catch(RuntimeException ex){
          System.out.println(ex);
      }finally{//一定會執行的區塊
         t1.clear();  
      }
      
      test(true);
      
    }
    
}
