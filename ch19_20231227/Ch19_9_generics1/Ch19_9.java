/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_9_generics1;

/**
 *
 * @author xvpow
 */
public class Ch19_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyList myList = new MyList();
       myList.add("Ken");
       myList.add("Iris");
       myList.add("Lucy");
       myList.foreach(v->System.out.println(v));
       
      MyList<Integer> myList2 = new MyList(); 
      myList2.add(10);
      myList2.add(20);
      myList2.add(50);
       myList2.foreach(v->System.out.println(v));
    }
    
}
