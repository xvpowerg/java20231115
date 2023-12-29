/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_6_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Joy");
        list.add("Lucy");
        
       long count =  list.stream().count();
       System.out.println(count);
       //distinct 過濾重複
       list.stream().distinct().forEach(v->System.out.println(v));
        System.out.println("=============================");
       list.stream().skip(2).forEach(v->System.out.println(v));
    }
    
}
