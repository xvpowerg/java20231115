/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_5_stream5;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("A",70);
       Student st2 = new Student("B",85); 
       Student st3 = new Student("C",65);  
       Student st4 = new Student("D",25);   
       Student st5= new Student("E",88);   
       Student st6= new Student("F",15); 
       
       ArrayList<Student> list = new ArrayList();
       list.add(st1);
       list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       
      Map<Boolean,List<Student>> group1=  list.stream().collect(
               Collectors.partitioningBy(st->st.getScore() >= 60));
      System.out.println(group1);
      
     Map<Boolean,List<Integer>>  group2=  list.stream().collect(
               Collectors.partitioningBy(st->st.getScore() >= 60,
                       Collectors.mapping(st->st.getScore(), 
                               Collectors.toList())));
     System.out.println(group2);
    }
    
}
