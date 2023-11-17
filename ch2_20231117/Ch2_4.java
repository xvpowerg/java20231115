/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;
import java.util.Random;
public class Ch2_4 {
    public static void main(String[] args) {
        int i = 1;
        while( i<= 5){
            System.out.println(i);
            i++;
        }
       System.out.println("===========================");
       Random ran = new Random();
       //System.out.println(ran.nextInt(101));
       int v = -1;
       while(  (v = ran.nextInt(101) )!= 0 ){
          System.out.println(v);
       }
       
    }
    
}
