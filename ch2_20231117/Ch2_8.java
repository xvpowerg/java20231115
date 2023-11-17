/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array2x3 = new int[2][3];
        array2x3[0][0] = 52;
        array2x3[0][2] = 77;
        array2x3[1][1] = 83;
        
        for (int i = 0; i < 2;i++){
            for (int k = 0; k < 3 ; k++){
                System.out.print(array2x3[i][k]+" ");
            }
            System.out.println();
        }
    }
    
}
