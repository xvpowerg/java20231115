/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_9_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 = Paths.get("c:","mydir",".","test.jpg");
      System.out.println(p1.normalize());
      Path p2 = Paths.get("c:","mydir","..","mymsg.txt");
      System.out.println(p2);
      System.out.println(p2.normalize());
    }
    
}
