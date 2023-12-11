/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20231211.Ch12_4_interfece1;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    public static void main(String[] args) {
       Fly bird1 = new Bird();
       bird1.flying();
       
       Fly airPlan = new AirPlan("MyPlan");
       airPlan.flying();//MyPlan Flying
    }
    
}
