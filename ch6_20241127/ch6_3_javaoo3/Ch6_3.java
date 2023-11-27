/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20241127.ch6_3_javaoo3;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Ken");
        t1.setAge(25);
        t1.print();
        //age 必須 大於等於0 小於 200
        Teacher t2 = new Teacher("Iris",31);
        t2.print();
        
        Teacher t3 = new Teacher();
        t3.print();
        
        Teacher t4 = new Teacher("Joy");
        t4.print();
    }
    
}
