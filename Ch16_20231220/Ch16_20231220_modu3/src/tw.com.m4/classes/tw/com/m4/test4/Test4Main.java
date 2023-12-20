/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m4.test4;
import tw.com.m3.test3.Test3;
import tw.com.m1.test1.TestM1;
import tw.com.m2.test2.TestM2;
/**
 *
 * @author xvpow
 */
public class Test4Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Test3 t3 = new Test3();
        TestM1 tm1 = new TestM1();
        TestM2 tm2 = new TestM2();
      t3.showTest1(tm1);
       t3.showTest2(tm2);
    }
    
}
