/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_9_lambda5;

/**
 *
 * @author xvpow
 */
public class Ch15_9 {
   private static String mySubStr(String msg,int i){
        if (i < 0  || i >= msg.length()){
            System.out.println("錯誤的i");
            return "";
        }
        String subStr = msg.substring(0, i);
        return subStr;
    }
    public static void main(String[] args) {
        // Method reference
        TestFunction4 func = Ch15_9::mySubStr ;
        String subStr = func.test("ABCDE", 4);
        System.out.println(subStr);
    }
    
}
