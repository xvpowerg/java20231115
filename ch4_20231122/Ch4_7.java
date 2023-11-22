/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //-128~127 Java覺得這區間的數字常用 於是會先建立起一些快取
         //如果封箱時使用區間內的數字 就會由快取內取出
        Integer v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2);
      
        Integer v3 = 129;
        Integer v4 = 129;
        System.out.println(v3 == v4);
        System.out.println(v3.equals(v4));
    }
    
}
