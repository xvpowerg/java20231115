/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5;i++){
            for (int k = 1; k<= 5; k++){
                System.out.print(i+"_"+k+" ");
            }
            System.out.println();
        }
        System.out.println("====================");
        for (int i = 1; i<= 5; i++){
            for (int k = 5 -i; k >=0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
    
}
