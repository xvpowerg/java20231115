/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i  = 1; i<= 5;i++){
            System.out.println(i);
            if (i == 3){
                break;
            }
        }
        System.out.println("=======================");
        for (int k= 1; k<= 5;k++){
            if ( k == 3){
                continue;
            }
            System.out.println(k);
        }
    }
    
}
