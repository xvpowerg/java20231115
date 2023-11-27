/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20241127.ch6_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //類別
         //一種模型
       //物件
        //依模型(類別)建物件
        Student st1;
        st1 = new Student();//依Student模型(類別)建Student物件
        Student st2 = new Student();
        Student st3 = new Student();
        st1.name = "Ken";
        st1.age = 18;
        st1.score = 81.25f;
        
        st2.name = "Vivin";
        st2.age = 25;
        st2.score = 86.3f;
        
        st3.name = "Iris";
        st3.age = 26;
        st3.score = 67;
        
        st1.print();
        st2.print();
        st3.print();
//        System.out.println(st1.name+":"+
//                        st1.age+":"+st1.score);
//        System.out.println(st2.name+":"+st2.age+":"+st2.score);
    }
    
}
