/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20231201.ch8_5_javaoo5_mf1;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Modifier 限制可見範圍
        //public 全Package公開
        //protected 繼承或相同Package公開
        //default(無填寫)相同Package公開
        //private 類別內公開
        
        Test1 t1 = new Test1();
        System.out.println(t1.publicV1);
        System.out.println(t1.protectedV2);
        System.out.println(t1.defaultV3);
         
    }
    
}
