/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_4_stream2;
import java.util.ArrayList;

public class Ch2_4 {
    
    
    public static void main(String[] args) {
     String st1 = "A,10";
     String st2 = "B,25";
     String st3 = "C,36";
    ArrayList<String> list = new  ArrayList();
    list.add(st1);
    list.add(st2);
    list.add(st3);
    ArrayList<Item> itemList = new ArrayList();
    for (String data :  list){
        String[] v1 = data.split(",");
//        System.out.println(v1[0]);
//        System.out.println(v1[1]);
        itemList.add(new Item(v1[0],Integer.parseInt(v1[1])));
    }
   System.out.println(itemList);
   
   

    }
    
}
