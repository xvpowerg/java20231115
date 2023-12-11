/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20231211.Ch12_6_interfece3;

/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      RobotActionIF rob = new Robot();
      rob.attack();
      rob.left();
      rob.walk();
    }
    
}
