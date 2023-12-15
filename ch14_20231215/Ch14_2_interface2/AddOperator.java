/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20231215.Ch14_2_interface2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class AddOperator  implements UnaryOperator<Integer>{
    private int number = 0;
    AddOperator(){}
    AddOperator(int number){
        this.number = number;
    }
    public Integer apply(Integer v){
        return v +number;
    }
}
