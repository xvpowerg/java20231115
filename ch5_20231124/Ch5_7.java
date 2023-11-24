/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    /**
     * @param args the command line arguments
     */
    //call by reference
    static void test(int[] a1){
      int tmp = a1[0];
      a1[0] = a1[1];
      a1[1] =  tmp;
    }
    
    public static void main(String[] args) {
      int[] a1 = {7,12};
      System.out.println(a1[0]+":"+a1[1]);
      test(a1);
      System.out.println(a1[0]+":"+a1[1]);
    }
    
}
