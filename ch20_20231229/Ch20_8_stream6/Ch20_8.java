/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_8_stream6;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_8 {

 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Lucy");
        list.add("Vivin");
        list.add("Ken");
        list.add("Joy");
        //allMatch 只要一個不符合條件就中斷
        boolean b1 = list.stream().peek(v->System.out.println("peek1:"+v)).
                allMatch(v->v.length() > 2);
        System.out.println(b1);
        System.out.println("==============================");
     boolean b2 = list.stream().peek(v->System.out.println("peek2:"+v)).
                allMatch(v->v.length() > 3);
        System.out.println(b2);
         System.out.println("==============================");
         //anyMatch 只要一個符合條件就中斷 回傳true
       boolean b3 =  list.stream().peek(v->System.out.println("peek3:"+v)).
               anyMatch(v->v.length() > 4);
       System.out.println(b3);
       System.out.println("==============================");
       boolean b4 =  list.stream().peek(v->System.out.println("peek4:"+v)).
               anyMatch(v->v.length() < 2);
       System.out.println(b4);
       System.out.println("==============================");
       //noneMatch 只要一個符合條件就中斷 回傳false
       boolean b5 =  list.stream().peek(v->System.out.println("peek5:"+v)).
               noneMatch(v->v.length() < 2);
        System.out.println(b5);
       System.out.println("==============================");
       boolean b6 =  list.stream().peek(v->System.out.println("peek6:"+v)).
               noneMatch(v->v.length() > 4);
       System.out.println(b6);
       System.out.println("==============================");
    }
    
}
