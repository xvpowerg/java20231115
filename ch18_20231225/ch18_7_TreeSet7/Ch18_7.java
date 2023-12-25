/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20231225.ch18_7_TreeSet7;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",72,85,93);
        Student st2 = new Student("Vivin",72,77,65);
        Student st3 = new Student("Lucy",84,31,96);
        Student st4 = new Student("Joy",84,31,93);
        Student st5 = new Student("Iris",72,85,93);
        Comparator<Student> cmp =  Comparator.comparing(st->st.getScore1());
        cmp = cmp.thenComparing(st->st.getScore2()).
                thenComparing(st->st.getScore3()).
                thenComparing(st->st.getName());
       // cmp =  cmp.reversed();
        TreeSet<Student> setSt = new TreeSet(cmp);
        setSt.add(st1);
        setSt.add(st2);
        setSt.add(st3);
        setSt.add(st4);
        setSt.add(st5);
        System.out.println(setSt);
    }
    
}
