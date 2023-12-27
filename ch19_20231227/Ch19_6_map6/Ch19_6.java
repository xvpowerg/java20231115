/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_6_map6;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> groupMap = new HashMap<>();
        groupMap.put("Ken", 100);
        groupMap.put("Vivin", 89);
        groupMap.put("Lucy", 95);
        
        //key 不存在
        //compute 會執行function v會是null
         groupMap.compute("Joy", (k,v)->{
             System.out.println(k+":"+v);
             //return v+20;
             return 20;
         });
         System.out.println(groupMap);
        //computeIfAbsent 會執行function
     groupMap.computeIfAbsent("Ben", (k)->{
                        System.out.println(k);
                        return 10;
     });
     System.out.println(groupMap);
     //computeIfPresent 不會執行function
     groupMap.computeIfPresent("Gigi", (k,v)->{
            System.out.println(k+":"+v);
            return v + 5;
     });
     System.out.println(groupMap);
    }
    
}
