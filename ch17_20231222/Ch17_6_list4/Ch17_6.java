/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20231222.Ch17_6_list4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken", 25);
        Student st2 = new Student("Vivin", 31);
        Student st3 = new Student("Lucy", 26);
        Student st4 = new Student("Joy", 35);
        Student st5 = new Student("Iris", 28);
        Student data = new Student("Lucy", 26);
        ArrayList<Student> stList = new ArrayList();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        System.out.println(stList);
        //會使用equals比較
       System.out.println(
               stList.contains(data));
    }

}
