/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_4_TreeSet4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    public static void main(String[] args) {
        Item item1 = new Item(12,"A");
        Item item2 = new Item(5,"B");
        Item item3 = new Item(3,"C");
        Item item4 = new Item(9,"D");
        Item item5 = new Item(3,"C");
        TreeSet<Item> treeSet = new TreeSet();
        treeSet.add(item1);
         treeSet.add(item2);
          treeSet.add(item3);
           treeSet.add(item4);
           treeSet.add(item5);
         System.out.println(treeSet);
    }
    
}
