/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_6_stream6;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch22_6 {
    
    public static void main(String[] args) {
       ArrayList<Student> list = new ArrayList();
        Student st1 = new Student("Ken",75);
        Student st2 = new Student("Vivin",83);
        Student st3 = new Student("Gigi",65);
        Student st4 = new Student("Iris",71);
        Student st5 = new Student("Joy",43);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
       //找出所有大於70的成績
       //列出所有大於70的成績的姓名
       //這些姓名轉為字串 金榜:XXX,XXX.
       Comparator<Student> cmp = Comparator.comparing(st->st.getScore());
       cmp = cmp.reversed();
      String myNames =  list.stream().filter(st->st.getScore() > 70).
                sorted(cmp).
               map(st->st.getName()).collect(
                       Collectors.joining(",", "金榜:", "."));
      System.out.println(myNames);
    }
    
}
