/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_1_thread1;

/**
 *
 * @author xvpow
 */
public class Ch26_1 {

    static class TestThreadSafe{
        private int x = 0;
        
           public  void test(){
              //synchronized(this){}這個範圍的才同步
            synchronized(this){
                for (int i = 1; i<= 5;i++){
                    x++;
                    System.out.println(Thread.currentThread().getName()+":"+x);
                }
            }
          
            
        }
//        public synchronized void test(){
//            
//            for (int i = 1; i<= 5;i++){
//                x++;
//                System.out.println(Thread.currentThread().getName()+":"+x);
//            }
//            
//        }
    }
    public static void main(String[] args) {
       TestThreadSafe safe = new TestThreadSafe();
       Thread th1 = new Thread(()->{
         safe.test();
       });
       
       Thread th2 = new Thread(()->{
         safe.test();
       });
      th1.start();
      th2.start();
       
    }
    
}
