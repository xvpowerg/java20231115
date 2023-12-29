/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_5_stream3;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Joy");
        
        list.stream().peek(v->System.out.println("peek:"+v)).findAny();
        list.stream().peek(v->System.out.println("peek2:"+v)).
                filter(v->v.length() > 2);
    }
    
}
