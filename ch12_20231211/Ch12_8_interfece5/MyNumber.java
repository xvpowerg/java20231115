/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20231211.Ch12_8_interfece5;

/**
 *
 * @author xvpow
 */
public interface MyNumber {
    int getNumber();
    public default int add(int v1){
        return v1 + getNumber();
    }
}
