/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20231222.Ch17_5_list3;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch17_5 {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
       //如果List空 pop會拋出 java.util.NoSuchElementException
       System.out.println(list.pop());
       //如果List空 poll會是null
       System.out.println(list.poll());
         LinkedList<Integer> list2 = new LinkedList();
         list2.add(100);
         list2.add(150);
         list2.add(152);
         list2.add(160);
       //使用一個迴圈 搭配poll把list都輪巡
//       while(!list2.isEmpty()){
//          System.out.print(list2.pop()+" "); 
//       }

//      Integer v;
//      while( (v =list2.poll()) != null ){
//          System.out.print(v+" "); 
//       }
      try{
           while(true){
               System.out.print(list2.pop()+" ");
            }
      }catch(Exception ex){}
     
    }
    
}
