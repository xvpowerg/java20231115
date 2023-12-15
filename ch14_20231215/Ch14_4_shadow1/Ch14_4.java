/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_4_shadow1;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

 
    public static void main(String[] args) {
        //遮蔽看類別
        //複寫看物件
        
        Test1 t2 = new Test2();
        t2.showValue();//這是複寫
        t2.staticPrint();
        //靜態與所有屬性都是遮蔽
        //非靜態的方法可複寫
    }
    
}
