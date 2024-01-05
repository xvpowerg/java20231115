/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_3_stream3;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Lucy");
        nameList.add("Howard");
        nameList.add("Ben");
       Map<Integer,String> map =  nameList.stream().collect(
                Collectors.toMap(n->n.length(), n->n,(v1,v2)->v1+":"+v2));
       System.out.println(map);
    }
    
}
