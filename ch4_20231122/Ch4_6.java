/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Boxing 封箱
        /*byte Byte
        short Short
        int Integer
        long  Long
        float Float
        double Double
        char Character
        boolean Boolean
       */
        int value2 = 25;
        Integer objv2 = Integer.valueOf(value2);
        //unboxing 解封箱
        int value3 = objv2.intValue();
        System.out.println(objv2);
        System.out.println(value3);
        
        //自動封箱
        Integer objv3 = 92;
        //自動解封箱
        int value4 = objv3;
        System.out.println(objv3+":"+value4);
    }
    
}
