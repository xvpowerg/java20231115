/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_3_map3;

import java.util.HashMap;
public class Ch19_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> groupMap = new HashMap<>();
        groupMap.put("Ken", 100);
        groupMap.put("Vivin", 89);
        groupMap.put("Lucy", 95);
        //Key 存在合併
        //Key 不存在新增
        groupMap.merge("Vivin", 72, (v1,v2)->v1+v2);
        System.out.println(groupMap);
        groupMap.merge("Iris", 85, (v1,v2)->v1+v2);
        System.out.println(groupMap);    
    }
    
}
