/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20231215.Ch14_9_String;

/**
 *
 * @author xvpow
 */
public class Ch14_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "Ken,Vivin,Lucy";
        String[] msgArray =  msg.split(",");
        for (String s : msgArray){
            System.out.println(s);
        } 
    }
    
}
