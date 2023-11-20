/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20231120;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] array2x3 = new int[2][3];
      array2x3[0][1] = 71;
      array2x3[1][1] = 85;
      array2x3[1][2] = 92;
      
      System.out.println(array2x3.length);
      System.out.println(array2x3[0].length);
      System.out.println(array2x3[1].length); 
      
      for (int i = 0; i < array2x3.length;i++){
          for (int x = 0; x < array2x3[i].length;x++){
              System.out.print(array2x3[i][x]+" ");
          }
          System.out.println();
      }
      //for eache
      for (int[] a1 : array2x3){
          for (int v : a1){
              System.out.print(v+" ");
          }
           System.out.println();
      }
    }
    
}
