/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20231115;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //null表示什麼都沒有 
        //java.lang.NullPointerException
        String name = null;

        switch(name){
            case "Vivin":
                System.out.println("PM");
                break;
            case "Ken":    
                  System.out.println("RD");
                break;
            case "Lucy":
                System.out.println("HR");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
