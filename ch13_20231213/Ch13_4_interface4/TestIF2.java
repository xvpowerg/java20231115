/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20231213.Ch13_4_interface4;


/**
 *
 * @author xvpow
 */
public interface TestIF2   {
    //因為複寫了TestIF1 的print()所以解決重複方法的問題
     public default void print(){
        System.out.println("TestIF2");
    }
}
