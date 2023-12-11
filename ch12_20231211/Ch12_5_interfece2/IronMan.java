/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_5_interfece2;

/**
 *
 * @author xvpow
 */
public class IronMan implements Fly,Jump,Run {
    public void flying(){
        System.out.println("IronMan flying");
    }
    public void jumping(){
         System.out.println("IronMan jumping");
    }
    public void runing(){
         System.out.println("IronMan runing");
    }
}
