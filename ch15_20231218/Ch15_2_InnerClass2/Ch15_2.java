/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_2_InnerClass2;
import  ch15_20231218.Ch15_2_InnerClass2.TestInnerClass.TestStaticClass;
public class Ch15_2 {
    public static void main(String[] args) {
       TestInnerClass.TestStaticClass ts =
               new TestInnerClass.TestStaticClass("Ken","A001");
       System.out.println(ts);
       
       TestStaticClass ts2 = new TestStaticClass("Lucy","A002");
        System.out.println(ts2);
    }
    
}
