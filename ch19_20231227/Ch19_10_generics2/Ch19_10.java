/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_10_generics2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Test<ArrayList<Integer>,Integer> t1 
              = new Test(new ArrayList());
      
      t1.add(10);
      t1.add(30);
      t1.add(40);
      
      System.out.println(t1.get(0));
      System.out.println(t1.get(1));
    
    }
    
}
