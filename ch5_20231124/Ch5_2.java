/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean b1  = Boolean.parseBoolean("true");
       System.out.println(b1);
       System.out.println(!b1);
       //只要不是true救回傳false
       boolean b2 = Boolean.parseBoolean("tRuE");
       System.out.println(b2);
      boolean b3 =  Boolean.parseBoolean("AAAA");
        System.out.println(b3);
    }
    
}
