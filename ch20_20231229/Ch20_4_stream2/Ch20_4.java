/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_4_stream2;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    public static void main(String[] args) {
      //Stream 不可修改性
      //Stream 不可重複使用
      //Stream 有惰性與終端
      ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Joy");
       list.stream().forEach(v->System.out.println(v));
       System.out.println("===================");
      list.stream().filter(v->v.length() > 3).
              forEach(v->System.out.println(v));
      //Stream 不可修改性
      System.out.println(list.size());
        System.out.println("===================");
        //Stream 不可重複使用
      Stream<String> st1 = list.stream();
      st1.filter(v->v.length() > 2).forEach(v->System.out.println(v));
      //st1.filter(v->v.length() > 3).forEach(v->System.out.println(v));
    }
    
}
