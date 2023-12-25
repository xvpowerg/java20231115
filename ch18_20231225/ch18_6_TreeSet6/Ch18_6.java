/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_6_TreeSet6;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    private static class MyComparator implements Comparator<Item>{
        private int i = 1;
        public int compare(Item i1,Item i2){
            /*
             左大於右回傳正數
             左小於右回傳負數
             左等於右回傳0
            */
            if (i1.getId() > i2.getId()){
                return 1*i;
            }else if(i1.getId() < i2.getId()){
                return -1*i;
            }
            return 0;
        }
        public void reverse(){
             i*=-1;
        }
    }
    public static void main(String[] args) {
     Item item1 = new Item(12,"A");
        Item item2 = new Item(5,"B");
        Item item3 = new Item(3,"C");
        Item item4 = new Item(9,"D");
        Item item5 = new Item(3,"C");
        MyComparator cmp = new MyComparator();
        cmp.reverse();
        TreeSet<Item> treeSet = new TreeSet(cmp);
        treeSet.add(item1);
         treeSet.add(item2);
          treeSet.add(item3);
           treeSet.add(item4);
           treeSet.add(item5);
         System.out.println(treeSet);
    }
    
}
