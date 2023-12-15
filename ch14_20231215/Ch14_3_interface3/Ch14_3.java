/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_3_interface3;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch14_3 {

    public static  ArrayList<Integer> filter(ArrayList<Integer> list,
            Predicate<Integer> check){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer v : list){
            if (check.test(v)){
                result.add(v);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(100);
        list.add(36);
         list.add(5);
          list.add(11);
           list.add(8);  
       ArrayList<Integer> evenList = 
               filter(list,new TestEven());   
       System.out.println(evenList);
    }
    
}
