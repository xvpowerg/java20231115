/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em1 = new Employee();
        em1.setName("Ken");
        em1.setAge(25);
        em1.setSalary(280000);
        em1.print();
        
        Employee em2 = 
        new Employee("Vivin",30,350000);
        em2.print();
        PM pm = new PM();
        pm.setName("Lucy");
        pm.setAge(35);
        pm.setSalary(65000);
        pm.print();
        
        PM pm2 = new PM("Gigi",
                36,66000);
        pm2.print();
        RD rd = new RD("Ben",28,57000);
        rd.print();
    }
    
}
