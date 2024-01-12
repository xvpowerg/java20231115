/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_2_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class Ch25_2 {
    public static void main(String[] args)throws IOException {
       Path p1 = Paths.get("c:","mydir");
        Stream<Path> sp1 =  Files.list(p1);
        sp1.forEach(p->System.out.println(p));
        
        
    } 
}
