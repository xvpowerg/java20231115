/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_3_TreeSet3;
import java.util.TreeSet;
public class Ch18_3 {
    public static void main(String[] args) {
        //預設排序是小到大
      TreeSet<Integer> treeSet = new TreeSet();
      treeSet.add(19);
      treeSet.add(5);
      treeSet.add(2);
      treeSet.add(21);
      treeSet.add(3);
      System.out.println(treeSet);
      System.out.println(treeSet.first());
      System.out.println(treeSet.last());
     
      System.out.println(treeSet.ceiling(6));
      System.out.println(treeSet.higher(6));
      //ceiling >=5
      //higher >5
      System.out.println(treeSet.ceiling(5));
      System.out.println(treeSet.higher(5));
   System.out.println("====================");
     System.out.println(treeSet.floor(6));
     System.out.println(treeSet.lower(6));
    //floor <=5
    //lower <5
    System.out.println(treeSet.floor(5));
     System.out.println(treeSet.lower(5));
      //treeSet.lower(Integer.SIZE)
    }
    
}
