/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_10_lambda6;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch15_10 {

    static void dataToOhterStr(ArrayList<String> data,
            UnaryOperator<String>op){
       for(String d : data){
          System.out.println(op.apply(d));
       }
    } 
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Ken");
        data.add("Vivin");
        data.add("Lucy");
//        s.toUpperCase()
//                s.toLowerCase()
        dataToOhterStr(data,String::toUpperCase);
        dataToOhterStr(data,String::toLowerCase);
    }
    
}
