/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_4_stream4;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Lucy");
        nameList.add("Joy");
        nameList.add("Iris");
        nameList.add("Howard");
        nameList.add("Vivin");
        nameList.add("Ben");
      Map<Integer,List<String>> group1 =   nameList.stream().collect(
                Collectors.groupingBy(n->n.length()));
      System.out.println(group1);
      
      Map<Integer,Long> group2 = nameList.stream().collect(Collectors.groupingBy(n->n.length(), 
              Collectors.counting()));
      System.out.println(group2);

      
    }
    
}
