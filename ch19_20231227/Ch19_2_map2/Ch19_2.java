/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_2_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String, Integer> groupMap = new HashMap<>();
        groupMap.put("Ken", 100);
        groupMap.put("Vivin", 89);
        groupMap.put("Lucy", 95);
      //  groupMap.put("Vivin", 72);
        if (groupMap.containsKey("Vivin")){
           int v =  groupMap.get("Vivin");
           v += 72;
           groupMap.put("Vivin",v);   
        }else{
         groupMap.put("Vivin",72);   
        }
        
       System.out.println(groupMap);
       groupMap.putIfAbsent("Joy",82);
       System.out.println(groupMap);
       groupMap.putIfAbsent("Ken",82);
       System.out.println(groupMap);
    }
    
}
