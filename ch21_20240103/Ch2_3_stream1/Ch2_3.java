/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_3_stream1;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      list.add("Joy");
      Optional<String> op1 = list.stream().findAny();//併行時不會維持一個List的順序
      Optional<String> op2 = list.stream().findFirst();//併行時會維持一個List的順序
      System.out.println(op1.get());
      System.out.println(op2.get());
      
    }
    
}
