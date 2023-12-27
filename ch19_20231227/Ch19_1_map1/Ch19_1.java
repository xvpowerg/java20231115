/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_1_map1;

import java.util.HashMap;
import java.util.Set;
public class Ch19_1 {

    public static void main(String[] args) {
        //key 與 value
        HashMap<String, Integer> groupMap = new HashMap<>();
        groupMap.put("Ken", 100);
        groupMap.put("Vivin", 89);
        groupMap.put("Lucy", 95);
        System.out.println(groupMap.get("Ken"));
        System.out.println(groupMap.get("Lucy"));
        
        Set<String> keySet = groupMap.keySet();
        for (String key : keySet){
            System.out.println(key+":"+groupMap.get(key));
        }
        System.out.println("==========================");
        groupMap.forEach((k,v)->System.out.println(k+":"+v));
    }
}
