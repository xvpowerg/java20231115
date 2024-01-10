/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_8_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_8 {

    public static void main(String[] args) {
            
      Path p1 =  Paths.get("c:", "mydir");
      Path p2 = Paths.get("myFile.jpg");
      Path p3 =  p1.resolve(p2);
      System.out.println(p3);
      
      Path p4 = Paths.get("c:", "mydir");
      Path p5 = Paths.get("d:","myimge","test.jpg");
      Path p6 =  p4.resolve(p5);//因為p5是完整路徑所以取代p4
      System.out.println(p6);
      
      
    }
    
}
