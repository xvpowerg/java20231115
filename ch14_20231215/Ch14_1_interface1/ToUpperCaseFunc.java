/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20231215.Ch14_1_interface1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class ToUpperCaseFunc implements  Function<String,String>{
    public String apply(String s){
        return s.toUpperCase();
    }
}
