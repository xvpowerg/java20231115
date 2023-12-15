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
public class StringToInteger implements Function<String,Integer>{
    public Integer apply(String st){
        return st.length();
    }
}
