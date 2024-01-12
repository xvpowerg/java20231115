/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_1_nio2_1;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    
    public static void main(String[] args) throws IOException{
       Path p1 = Paths.get("c:", "mydir","myfile.txt");
       Path p2 = Paths.get("c:", "mydir","myfile.txt"); 
      System.out.println(Files.isSameFile(p1, p2));
      
       Path p3 = Paths.get("c:", "mydir2","myfile.txt");
       Path p4 = Paths.get("c:", "mydir2","myfile.txt"); 
        System.out.println(Files.isSameFile(p3, p4));
        
        //只有路徑名稱不一樣才會真搜尋檔案是否相同
       Path p5 = Paths.get("c:", "mydir2","myfile.txt");
       Path p6 = Paths.get("c:",".", "mydir2","myfile.txt"); 
         System.out.println(Files.isSameFile(p5, p6));
    }
    
}
