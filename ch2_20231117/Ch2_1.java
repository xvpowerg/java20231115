/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        for (i = 1 ; i<= 10 ; i++ ){
            System.out.println(i);
        }
        System.out.println("End:"+i);
        for (int k =10,x = 5;k >= 2 && x <= 20;k--,x+=2){
            System.out.println(k+":"+x);
        }
    }
    
}
