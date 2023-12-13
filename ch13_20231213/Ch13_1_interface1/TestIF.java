/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20231213.Ch13_1_interface1;

/**
 *
 * @author xvpow
 */
public interface TestIF {
    
    //不會用到介面抽象方法的 可選告成靜態方法
    public static int max(int v1,int v2){
        return v1 > v2 ? v1:v2;
    }
    
   
}
