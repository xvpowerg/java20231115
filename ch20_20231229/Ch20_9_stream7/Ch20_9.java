/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_9_stream7;

import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch20_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
        list.add("Lucy");
        list.add("Vivin");
        list.add("Ken");
        list.add("Joy");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("==================");
        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
    
}
