/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_8_stream6;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch2_8 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
       String html =  list.stream().reduce("",(v1,v2)->{
           System.out.println(v1+":"+v2);
            return v1+"<li>"+v2+"</li>";
        });
       
       System.out.println("<ol>"+html+"</ol>");
    }
    
}
