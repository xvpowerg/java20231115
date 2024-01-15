/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {

    static class TestLock{
        public synchronized void test1(TestLock lock,String name){
            System.out.println("Test1 Start!:"+Thread.currentThread().getName());
            lock.test2(name);
        }
        public synchronized void test2(String name){
            System.out.println("TestLock 2:"+name);
        } 
    }
    public static void main(String[] args) {
      TestLock t1 = new TestLock();
      TestLock t2 = new TestLock();
      Thread th1 = new Thread(()->{
        t1.test1(t2, "T1");
      });
      
      Thread th2 = new Thread(()->{
         t2.test1(t1, "T2");
      });
      th1.start();
      th2.start();
     
    }
    
}
