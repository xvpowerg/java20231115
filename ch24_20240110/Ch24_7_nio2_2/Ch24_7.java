/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_7_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {

    public static void main(String[] args) {
       Path p1 = Paths.get("c:", "mydir","myfile.txt");
       System.out.println(p1);
       System.out.println(p1.getRoot());
       System.out.println(p1.getNameCount());
       
      Path p2 = Paths.get("c", "mydir","myfile.txt");
       System.out.println(p2);
       System.out.println(p2.getRoot());
       System.out.println(p2.getNameCount());
       
        Path p3 = Paths.get("c:", "A","B","C","D");
       System.out.println(p3); 
       System.out.println(p3.subpath(0, 3)); 
       
       Path p4 = Paths.get("c", "A","B","C","D");
        System.out.println(p4.subpath(1, 4)); 
    }
    
}
