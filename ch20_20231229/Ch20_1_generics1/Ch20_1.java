/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20231229.Ch20_1_generics1;
import java.util.ArrayList;
public class Ch20_1 {

  
    
    static void printList(ArrayList<Test1> list){
        list.add(new Test1());
        list.add(new Test2());
        for (Test1 v : list){
            System.out.println(v);
        }
       System.out.println("====================");       
    }
    //我希望可以是Test1或子類
    static void printList2(ArrayList<? extends Test1> list){
        //<? extends Test1> 變唯讀
        //list.add(new Test2());
        for (Test1 v : list){
            System.out.println(v);
        }
    }
    
     static void printList3(ArrayList<? super Test3> list){
         list.add(new Test3());
        for (Object v : list){
            System.out.println(v);
        } 
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Test1> list = new ArrayList<>();
        list.add(new Test1());
        list.add(new Test2());
        System.out.println(list.get(0));
        printList(list);
       ArrayList<Test2> list2 = new ArrayList<>();
        list2.add(new Test2());
         list2.add(new Test2());
         list2.add(new Test2());
       printList2(list2);  
       System.out.println("================================");
       ArrayList<Test1> list3 = new ArrayList<Test1>();
       list3.add(new Test1());
       list3.add(new Test1());
      ArrayList<Test2> list3_2 = new ArrayList<Test2>();
      list3_2.add(new Test2());
      list3_2.add(new Test2());
      printList3(list3);
      printList3(list3_2);
    }
    
}
