/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_1_interface1;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    static ArrayList<String> mapToString(ArrayList<String> list,
            Function<String,String> fun){
        ArrayList<String> result = new ArrayList();
        for (String v : list){
          result.add(fun.apply(v));
        }
        return result;
    }
    static ArrayList<Integer> mapToInt(ArrayList<String>list,
            Function<String,Integer> fun){
           ArrayList<Integer> result = new ArrayList<>();
           for (String v : list){
              result.add(fun.apply(v));
           }
        return result;
    }
    
    public static void main(String[] args) {
         //Function<T,​R>	R apply​(T t) 轉換
        //UnaryOperator<T> T apply​(T t) 一元運算
        //Predicate<T>boolean	test​(T t) 測試條件
        
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Vivin");
        nameList.add("Lucy");
        nameList.add("Iris");
       ArrayList<String> result =  mapToString(nameList,
               new ToUpperCaseFunc());
       System.out.println(result);
     ArrayList<Integer> result2 = 
             mapToInt(nameList,new StringToInteger());
     System.out.println(result2);
    }
    
}
