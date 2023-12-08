/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20231208.ch11_1_equals1;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",62);
        Student st2 = new Student("Ken",62);
        String st3 = "Vivin";
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(null));
    }
    
}
