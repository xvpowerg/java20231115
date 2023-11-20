/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20231120;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {
    
    public static void main(String[] args) {
        
        int[][] array1 = new int[2][3];
        int[] array2[] = new int[2][3];
        int array3[][] = new int[2][3];
        
        int[][] array4 = { {2,3,4},
                           {5,6,7}};
        for (int[] a1 : array4){
            for (int v : a1){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        
        int[][] array5 = new int[][]{{8,9,10},
                                     {21,22,23}};
        int[][]  array6 = new int[2][];
        array6[0] = new int[]{15};
        array6[1] = new int[]{81,93};
        for (int[] a1 : array6){
            for (int v : a1){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    
}
