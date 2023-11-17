/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {
    public static void main(String[] args) {
         String[] names = {"Ken","Vivin","Lucy"};
        
        for (int i = 0; i < names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("=========================");
        
        for (String n : names){
            System.out.println(n);
        }
    }
    
}
