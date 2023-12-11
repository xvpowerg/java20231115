/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_4_interfece1;

/**
 *
 * @author xvpow
 */
public class AirPlan implements Fly{
    private String msg;
    AirPlan(String msg){
        this.msg = msg;
    }
    
    public void flying(){
        System.out.println(msg+" Flying");
    }
}
