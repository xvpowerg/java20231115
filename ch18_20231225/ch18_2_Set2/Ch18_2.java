/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_2_Set2;
import java.util.HashSet;
public class Ch18_2 {
    public static void main(String[] args) {
        //先判斷hasCode是相等
        //在判斷equals是否相等
        HashSet<Item> set1 = new HashSet();
        Item i1 = new Item(1,"A");
        Item i2 = new Item(2,"B");
        Item i3 = new Item(3,"C");
       Item i4 = new Item(4,"D");
        Item i5 = new Item(2,"B");
        Item i6 = new Item(3,"C");
     
       set1.add(i1);
       set1.add(i2);
       set1.add(i3);
       set1.add(i4);
       set1.add(i5);
       set1.add(i6);
       //System.out.println(i2.equals(i5));
       System.out.println(set1);
       
    }
    
}
