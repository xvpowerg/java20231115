/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_3_InnerClass3;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    static ArrayList<Integer> mapToInt(ArrayList<String> data,
            Function<String,Integer> func){
        ArrayList<Integer> result = new ArrayList<>();
        for (String v :data){
          result.add(func.apply(v));
        }
        
        return result;
    }
   private static class  MyFunction implements Function<String,Integer>{
        public Integer apply(String str){
            return str.length();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> data = new ArrayList<String>();
        MyFunction myFunc = new MyFunction();
        data.add("Ken");
        data.add("Joy");
        data.add("Iris");
        data.add("Vivin");
        ArrayList<Integer> result = mapToInt(data,myFunc);
        System.out.println(result);
         ArrayList<Integer> result2 = mapToInt(data,
                 new Function<String,Integer>(){
                   public Integer apply(String v){
                       return v.length();
                   }
                 });
       System.out.println(result2);  
    }
    
}
