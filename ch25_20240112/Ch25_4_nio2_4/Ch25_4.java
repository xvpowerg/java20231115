/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_4_nio2_4;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.PathMatcher;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch25_4 {

    public static void main(String[] args)throws Exception {
          Path p1=  Paths.get("c:", "mydir");
          Stream<Path> ps1 =   Files.walk(p1);
//          List<Path> list = ps1.filter(p->p.getFileName().
//                  toString().endsWith("txt")).
//                  collect(Collectors.toList());
//          System.out.println(list);
       PathMatcher pm =  FileSystems.getDefault().getPathMatcher("glob:**.txt");
       List<Path> list2 = ps1.filter(p->pm.matches(p)).collect(Collectors.toList());
       System.out.println(list2);
      
    }
    
}
