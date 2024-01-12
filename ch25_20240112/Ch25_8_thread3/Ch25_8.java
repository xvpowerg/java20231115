/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_8_thread3;

/**
 *
 * @author xvpow
 */
public class Ch25_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread th1 = new Thread(()->{
           System.out.println("Thread:"+Thread.currentThread().getName());
       });
        th1.start();
        //th1.start();
        th1.run();
     
    }
    
}
