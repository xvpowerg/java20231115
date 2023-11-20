/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20231120;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch3_6 {
    public static void main(String[] args) {
      int[] array1 = {9,10,2,6,7,8,11};
      int[] copyArray = new int[array1.length];
      
      for (int i =0; i< array1.length; i++){
         copyArray[i] =  array1[i];
      }
      System.out.println(copyArray[3]+":"+array1[3]);
     int[] copyArray2 = Arrays.copyOf(array1, 
             array1.length);
     System.out.println(copyArray[3]+":"+copyArray2[3]); 
     
     
    }
    
}
