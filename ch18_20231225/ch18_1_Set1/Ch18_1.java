/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_1_Set1;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //可過濾重複
        //無序
        //查找快
        HashSet<String> set1 = new HashSet<>();
        set1.add("Ken");
        set1.add("Apple");
        set1.add("Lucy");
        set1.add("Ken");
        set1.add("Iris");
        set1.forEach(v -> System.out.println(v));

        ArrayList<String> dataList = new ArrayList();

        dataList.add("A");
        dataList.add("B");
        dataList.add("A");
        dataList.add("C");
        dataList.add("B");
        System.out.println(dataList);
       HashSet<String> set2 = new HashSet<>(dataList);
        System.out.println(set2);
    }

}
