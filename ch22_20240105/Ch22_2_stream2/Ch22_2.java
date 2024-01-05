/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_2_stream2;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ken");
        nameList.add("Lucy");
        nameList.add("Howard");
  
       Map<Integer,String> map =  nameList.stream().collect(
                Collectors.toMap(n->n.length(), n->n));
       System.out.println(map);
    }
    
}
