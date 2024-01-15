/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_3_thread3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch26_3 {

   
    public static void main(String[] args) {
       ExecutorService es = Executors.newCachedThreadPool();
       for (int i =1; i<=50;i++){
             es.execute(()->{
                System.out.println("Thread Name:"+Thread.currentThread().getName());

            });
       }
 
       es.shutdown();
       
    }
    
}
