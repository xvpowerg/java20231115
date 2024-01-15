/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_5_thread5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    public static void main(String[] args) {
       Random  ran = new Random ();
       ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> fe =  es.submit(()->{
                System.out.println("Wait....");
                TimeUnit.SECONDS.sleep(3);
                return ran.nextInt(50000);
        });
        es.shutdown();
        System.out.println("Start!!");
        try{
           System.out.println(fe.get());
        }catch(Exception ex){
            
        }
     
        System.out.println("End!!"); 
    }
    
}
