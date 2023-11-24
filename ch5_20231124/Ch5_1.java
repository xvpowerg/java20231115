/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;
public class Ch5_1 {

    public static void main(String[] args) {
        //字串轉整數
        String v1 = "25";
        int v2 = Integer.parseInt(v1);
        System.out.println(v1+10);
        System.out.println(v2+10);
        
        String v3 = "AAA";
        System.out.println(Integer.parseInt(v3));//java.lang.NumberFormatException
        
    }
    
}
