/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20231213.Ch13_6_interface6;

/**
 *
 * @author xvpow
 */
public class MaxFunc implements MyFunc {
    public int cmp(int v1,int v2){
        return v1 > v2 ? v1:v2;
    }
}
