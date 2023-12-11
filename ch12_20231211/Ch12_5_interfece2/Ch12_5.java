/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20231211.Ch12_5_interfece2;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IronMan ironMan = new IronMan();
        
        Fly f1 = ironMan;
        Jump jump = ironMan;
        Run run = ironMan;
        
        f1.flying();
        jump.jumping();
        run.runing();
        
    }
    
}
