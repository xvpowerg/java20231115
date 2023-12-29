/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_7_stream5;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Lucy");
        list.add("Vivin");
        list.add("Ken");
        list.add("Joy");
        //所有條件成立
        boolean b1 = list.stream().allMatch(v->v.length() > 2);
        System.out.println(b1);                
        //只要有一條件成立
       boolean b2 =  list.stream().anyMatch(v->v.length() < 4);
        System.out.println(b2);
       //所有條件都不成立
       boolean b3 =  list.stream().noneMatch(v->v.length() < 2);
       System.out.println(b3);
       
       
        
    }
    
}
