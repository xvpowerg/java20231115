/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_3_autoclose2;

/**
 *
 * @author xvpow
 */
public class Ch23_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               try(TestClose t1 = 
                new TestClose("Test1",true);
            TestClose t2 = 
                new TestClose("Test2",true);    ){
            System.out.println("Body!!");
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
          System.out.println("finally!!");  
        }
    }
    
}
