/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_2_generics2;
import java.util.function.Supplier;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {
        static Object testValue(Object v,Supplier<? extends Exception> sex)
                throws Exception{
            if (v == null){
               throw Test1.throwException(sex);
            }
            return v;
        }
    
    public static void main(String[] args)throws Exception {
        //方法范型會依傳入參數類型自動判斷
       String v1 = Test1.func1("A");
       int v2 = Test1.func1(25);
       System.out.println(v1);
       System.out.println(v2);
       testValue("Ken",()->new Exception("錯誤的訊息"));
        testValue(null,()->new IOException("錯誤的訊息"));
    }
    
}
