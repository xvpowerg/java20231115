/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_3_autoclose2;

/**
 *
 * @author xvpow
 */
public class Ch23_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TestClose t1 內容不可改變
       try(TestClose t1 = 
                new TestClose("Test1",true);
            TestClose t2 = 
                new TestClose("Test2",true);    ){
        //TestClose t1 = null; //TestClose t1 內容不可改變
            System.out.println("Body!!");
            throw new Exception("Body Exception");
        }catch(Exception ex){
            System.out.println(ex);
            Throwable[] ts =  ex.getSuppressed();
            for(Throwable thb : ts){
                System.out.println("Throwable:"+thb);
            }
        }finally{
          System.out.println("finally!!");  
        }
    }
    
}
