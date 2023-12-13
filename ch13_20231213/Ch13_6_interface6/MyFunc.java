/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20231213.Ch13_6_interface6;

/**
 *
 * @author xvpow
 */
@FunctionalInterface
public interface MyFunc {
//FunctionalInterface    
//抽象的方法只有一個 我就把這個抽象方法當成方法物件 可以傳入參數
    public int cmp(int v1,int v2);
}
