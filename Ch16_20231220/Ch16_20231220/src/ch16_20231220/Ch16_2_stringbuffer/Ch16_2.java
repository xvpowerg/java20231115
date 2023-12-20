/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20231220.Ch16_2_stringbuffer;

/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StringBuffer
        StringBuilder sb = new StringBuilder();
        for (int i =1; i<=10; i++){
            sb.append(i+" ");
        }
       System.out.println(sb.toString());
    }
    
}
