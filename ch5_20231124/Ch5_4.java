/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * 多載規則
     * 1 先找一樣類型
     * 2 相同類型可相容(int 可找 long)
     * 3 不同類型可相容
     * 4 封箱類型
     */
    
    static void test1(int v1){
        System.out.println("int:"+v1);
    }
    static void test1(float f1){
        System.out.println("float:"+f1);
    }
    static void test2(short s1){
        System.out.println("Short:"+s1);
    }
    static void test2(long v2){
        System.out.println("long:"+v2);
    }
    static void test3(short s1){
        System.out.println("Short:"+s1);
    }
    static void test3(float f1){
        System.out.println("Float:"+f1);
    }
    
    static void test4(byte b1){
        System.out.println("test4 Byte:"+b1);
    }
    static void test4(Integer i){
        System.out.println("test4 Integer:"+i);
    }
    
    static void test5(byte b1){
        System.out.println("Byte:"+b1);
    }
    static void test5(Float f1){
        System.out.println("Float:"+f1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        test1(25);
        //整數預設是int類型
        test2(5);
        test3(10);
        short s = 25;
        test3(s);
        test4(15);
        //test5(2);
//        int v1 = 10;
//        float f2 = v1;
//        
//        Integer objV1 = 10;
//        Float objF2 = v1; 
        
    }
    
}
