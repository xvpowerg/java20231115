/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_8_map8;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch19_8 {

    public static void main(String[] args) {
        Comparator<Integer> cmp = Comparator.comparing(v->v);
        cmp = cmp.reversed();
        TreeMap<Integer,String> treeMap = new TreeMap(cmp);
        treeMap.put(85,"Lucy");
        treeMap.put(71,"Iris");
        treeMap.put(81,"Vivin");
        treeMap.put(65,"Joy");
        treeMap.put(92,"Ken");
        treeMap.put(77,"Gigi");
        System.out.println(treeMap);
        
        
        
    }
    
}
