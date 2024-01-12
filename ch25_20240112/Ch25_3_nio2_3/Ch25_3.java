/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_3_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
      Path p1=  Paths.get("c:", "mydir");
     Stream<Path> sp1 =   Files.walk(p1,0);
     sp1.forEach(p->System.out.println(p));
     //找出所有.txt的檔案
     //並整合成List
     
    }
    
}
