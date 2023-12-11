/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_6_interfece3;

/**
 *
 * @author xvpow
 */
public class Robot  implements RobotActionIF {
    public void attack(){
        System.out.println("Robot attack");
    }
    public void left(){
          System.out.println("Robot left");
    }
    public void walk(){
         System.out.println("Robot walk");
    }
}
