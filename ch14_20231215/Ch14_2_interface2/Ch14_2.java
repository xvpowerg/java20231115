/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_2_interface2;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    public static void calculateList(ArrayList<Integer> list,UnaryOperator<Integer> op){
            for (int i = 0; i < list.size();i++){
               Integer v =  list.get(i);
               Integer ans =  op.apply(v);
               list.set(i, ans);
            }
    }
    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList<>();
       myList.add(5);
       myList.add(11);
       myList.add(18);
       myList.add(10);
       calculateList(myList,
               new AddOperator(3));
       System.out.println(myList);
    }
    
}
