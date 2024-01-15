/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_4_thread4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_4 {

   
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(()->{
           System.out.println("Test1 Start");
           try{
                 TimeUnit.SECONDS.sleep(2);
           }catch(Exception ex){
               
           }
         
           System.out.println("Test1 End");
        });
        
        
         es.execute(()->{
           System.out.println("Test2 Start");
           try{
                 TimeUnit.SECONDS.sleep(3);
           }catch(Exception ex){
               
           }
         
           System.out.println("Test2 End");
        });
        
         es.execute(()->{
           System.out.println("Test3 Start");
           try{
                 TimeUnit.SECONDS.sleep(1);
           }catch(Exception ex){
               
           }
         
           System.out.println("Test3 End");
        });
         
          es.execute(()->{
           System.out.println("Tes4 Start");
           try{
                 TimeUnit.SECONDS.sleep(2);
           }catch(Exception ex){
               
           }
         
           System.out.println("Test4 End");
        });
          
        es.shutdown();
          
    }
    
}
