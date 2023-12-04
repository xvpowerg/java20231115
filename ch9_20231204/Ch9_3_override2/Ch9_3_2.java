/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20231204.Ch9_3_override2;

import ch9_20231204.Ch9_3_override1.Test1;

/**
 *
 * @author xvpow
 */
public class Ch9_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test3();
        t1.testPublic();
         Test3 t3 = (Test3)t1;
         t3.testProtected();
        
    }
    
}
