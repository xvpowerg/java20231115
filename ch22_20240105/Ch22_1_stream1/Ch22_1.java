/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_1_stream1;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.Collectors;

public class Ch22_1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Joy");
        list.add("Iris");
        list.add("Lucy");
        list.add("Ben");
        list.add("Vivin");
//      List<String> result =  list.stream().
//                filter(n->n.length() > 3).
//                collect(Collectors.toList());
//      System.out.println(result);
               
     ArrayList<String> result2 =  list.stream().map(v->v.toUpperCase()).
                collect(Collectors.toCollection(ArrayList::new));
      System.out.println(result2);

    }
    
}
