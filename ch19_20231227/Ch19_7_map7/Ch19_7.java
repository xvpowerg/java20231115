/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_7_map7;
import java.util.HashMap;
import java.util.ArrayList;
public class Ch19_7 {
    public static void main(String[] args) {
     ArrayList<String> data = new ArrayList();
     data.add("Ken");
     data.add("Iris");
     data.add("Ken");
     data.add("Lucy");
     data.add("Ken");
     data.add("Iris");
     data.add("Lucy");
     data.add("Iris");
     HashMap<String,Integer> nameGroupMap = new HashMap();
     for (String n : data){
         nameGroupMap.computeIfPresent(n, (k,v)->v + 1);
         nameGroupMap.computeIfAbsent(n, (k)->1);
     }
     System.out.println(nameGroupMap);
    }
    
}
