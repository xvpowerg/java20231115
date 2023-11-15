/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20231115;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 10;
        
        System.out.println(a1 == b1);
        
        String n1 = "Ken";
        String n2 = "Vivin";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 == n2);
        
        String n3 = "Ken";
        String n4 = new String("Ken");//建立一個新的字串空間
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n3 == n4);
        //比較每個字元是否相同
        System.out.println(n3.equals(n4));
        String n5 = null;
        System.out.println(n5.equals(n3));
    }
    
}
