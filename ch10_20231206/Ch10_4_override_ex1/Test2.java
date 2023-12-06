/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_4_override_ex1;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
//拋跟父類一樣的例外
//    public void testEx(boolean b1)throws MyException{
//        System.out.println("Test2");
//    }
//父類例外的子類   
    public void testEx(boolean b1)throws MyExceptionSub{
        System.out.println("Test2 Sub");
    }
//不拋例外    
//    public void testEx(boolean b1){
//        System.out.println("Test2 Sub");
//    }
    //除了RuntimeException 之外其他類型例外會出錯
//     public void testEx(boolean b1)throws IOException{
//        System.out.println("Test2 Sub");
//    }
}
