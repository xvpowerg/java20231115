/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20231229.Ch20_2_generics2;
import  java.util.function.Supplier;

public class Test1 {
    public static <T> T func1(T v){
        return v;
    }
    
    public static <T extends Exception> T throwException(Supplier<T> s){
        return s.get();
    }
    
}
