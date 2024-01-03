/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_4_stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch2_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String st1 = "A,10";
     String st2 = "B,25";
     String st3 = "C,36";
    ArrayList<String> list = new  ArrayList();
    list.add(st1);
    list.add(st2);
    list.add(st3);
    //map用來轉換為stream
    list.stream().map(str->{
        String[] data = str.split(",");
        Item item  =new Item(data[0],Integer.parseInt(data[1]));
        return item;  
    }).forEach(item->System.out.println(item));
    }
    
}
