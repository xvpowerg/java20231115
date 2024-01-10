/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_10_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 = 
               Paths.get("c:", "mydir","dir1","dir1_1");
       Path p2 = 
               Paths.get("c:", "mydir","dir2","dir2_1");
       Path p3 =   p1.relativize(p2);
       System.out.println(p3);
       //relativize 必須相同根目錄
       Path p4 = 
               Paths.get("c:", "mydir","dir1","dir1_1");
       Path p5 = 
               Paths.get("d:", "mydir","dir2","dir2_1");
       p4.relativize(p5);
    }
    
}
