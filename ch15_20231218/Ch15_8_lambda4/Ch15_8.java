/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_8_lambda4;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch15_8 {
//所長度大於3的寫入回傳ArrayList
    static ArrayList<Integer> filter(ArrayList<String> list,
            Predicate<String> p,Function<String,Integer> f){
        ArrayList<Integer> result = new ArrayList<>();
        for (String s : list){
            if (p.test(s)){
                result.add(f.apply(s));
            }
        }
       return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> dataList = new ArrayList();
        dataList.add("Ken");
        dataList.add("Iris");
        dataList.add("Vivin");
        dataList.add("Howard");
         dataList.add("Joy");
        ArrayList<Integer>  result = 
                filter(dataList,
                        s->s.length() > 3,
                        s->s.length());
        System.out.println(result);
    }
    
}
