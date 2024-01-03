/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_2_Optional2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    public static void main(String[] args) {
        Optional<String> op1 =   Optional.empty();
        Optional<String> op2 =   Optional.of("Ken");//不支持null
        Optional<String> op3 =   Optional.ofNullable(null);//支持null
        System.out.println(op2.get());
        if (op3.isPresent()){
              System.out.println(op3.get());//如果內容是空值會拋出Exception
        }
        op2.ifPresent(v->  System.out.println("op2 ifPresent:"+v));//op2內容不是null就執行action
        op3.ifPresent(v->  System.out.println("op3 ifPresent:"+v));//op3內容不是null就執行action
    
       System.out.println(op2.orElse("op2 orElse"));
       System.out.println(op3.orElse("op3 orElse"));
       
       System.out.println(op2.orElseGet(()->"op2 orElseGet "));
       System.out.println(op3.orElseGet(()->"op3 orElseGet "));
       
       System.out.println(op2.orElseThrow());//如果op2內容是null拋例外
       System.out.println(op3.orElseThrow(
               ()->new RuntimeException("op3 Eexception")));//如果op3內容是null拋例外
     
    }
    
}
