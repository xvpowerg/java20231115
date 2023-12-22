/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20231222.Ch17_4_list2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    static Integer myReplace(Integer v){
        return v %2 == 1?v+1:v;
    }
    static void printList( ArrayList <Integer> list){
        list.forEach(v->System.out.print(v+" "));
        System.out.println();
    }
    public static void main(String[] args) {
      ArrayList <Integer> list = new ArrayList<>();
      list.add(10);
      list.add(8);
      list.add(11);
      list.add(9);
      printList(list);
       ArrayList <Integer> list2 = new  ArrayList <>();
       list2.add(100);
       list2.add(130);
       list2.add(135);
       list.addAll(list2);
       printList(list);
       //插入
       list.add(2, 210);
       printList(list);
       
     System.out.println(list.contains(100));
     System.out.println(list.contains(300));
     System.out.println( list.indexOf(210));
     System.out.println( list.indexOf(300));
     
      list.remove(Integer.valueOf(11));
     //list.remove(3);
       printList(list);
       
     ArrayList<Integer> myList = new ArrayList();  
     myList.add(130);
     myList.add(9);
     list.removeAll(myList);
     printList(list);
     list.removeIf(v->v%2 != 0);
     printList(list);
     //=================
     list.set(1,81);
    printList(list);
    ArrayList<Integer>newList = new ArrayList<>();
    newList.add(1);
     newList.add(77);
     newList.add(2);
     newList.add(89);
     newList.add(7);
    newList.add(66);
    //newList.replaceAll(v->v+1);
//    newList.replaceAll(v->{
//        if (v % 2 == 1) return v+1;
//        return v;
//    });
    newList.replaceAll(Ch17_4::myReplace);
    printList(newList); 
    }
    
}
