/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_2_static_initblock2;
import java.util.ArrayList;

public class StaticInit {
    private static ArrayList<Integer> scores = new ArrayList();
    static{
        for (int i =1; i<=100;i++){
            scores.add(0);
        }
    }
    
    StaticInit(){}
   
   public static  int getScore(int index){
       //scores.add(0);
       return scores.get(index);
   } 
}
