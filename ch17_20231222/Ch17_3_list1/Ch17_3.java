/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20231222.Ch17_3_list1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       
       for (int i = 0; i < list.size();i++){
           System.out.println(i+":"+list.get(i));
       }
       
       for (String v : list){
           System.out.print(v+" ");
       }
       System.out.println();
       list.forEach(v->System.out.print(v+" "));
    }
    
}
