/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_11_generics3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t2 = new Test1();
        //泛型類不支持多型
        ArrayList<Test1> myList = new ArrayList<>();
        myList.add(new Test2());
        
    }
    
}
