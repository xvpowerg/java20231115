/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_8_interfece5;

/**
 *
 * @author xvpow
 */
public class MyInteger implements MyNumber {
    private int data;
    public MyInteger(int data){
        this.data = data;
    }
    public int getNumber(){
        return data;
    }
}
