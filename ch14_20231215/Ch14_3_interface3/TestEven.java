/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20231215.Ch14_3_interface3;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class TestEven  implements Predicate<Integer>{
    public boolean test(Integer v){
        return v % 2 == 0;
    }
}
