/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_1_InnerClass1;

/**
 *
 * @author xvpow
 */
public class Ch15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",25);
        Student.Phone p1 = st1.new Phone("Home","025528863");
        Student.Phone p2 = st1.new Phone("Cell","09208852231");
        st1.addPhone(p1);
        st1.addPhone(p2);
        System.out.println(st1);
        
       Student st2 = new Student("Lucy",31);   
       st2.addPhone("Home", "065531251");
       System.out.println(st2);
    }
    
}
