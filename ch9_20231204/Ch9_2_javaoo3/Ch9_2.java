/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20231204.Ch9_2_javaoo3;

/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Employee emp1 = 
             new Employee("Ken",30000);
     emp1.printInfo();
     PM pm1 = new PM("Iris",45000);
     pm1.printInfo();
     RD rd1 = new RD("Joy",360000);
     rd1.printInfo();
    }
    
}
