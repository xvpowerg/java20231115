/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20231120;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[3];
        System.out.println(array1[1]);
       // System.out.println(array1[3]);//ArrayIndexOutOfBoundsException
       /*整數類型陣列預設為0 
         浮點數類型陣列預設為0.0
         字元類型陣列預設為空白字元' '
         boolean類型陣列預設為false
         參考型態陣列預設為 null
       */
       float[] floatArray = new float[2];
       char[] charArray = new char[2];
       boolean[] boolArray = new boolean[2];
       String[] stringArray = new String[2];
       
       System.out.println(floatArray[1]);
       System.out.println(charArray[1]);
       System.out.println(boolArray[1]);
       System.out.println(stringArray[0]);
       
       int[] intArray = null ;//屬於參考型態
       //System.out.println(intArray);//java.lang.NullPointerException
       
       int[][] array2 = new int[2][];
       System.out.println("array2[0]:"+array2[0]);
    }
    
}
