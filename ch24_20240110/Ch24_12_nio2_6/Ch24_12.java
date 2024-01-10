/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_12_nio2_6;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path src = 
              Paths.get("c:","mydir","netbeans-20-bin-copy.zip");
        Path target = 
              Paths.get("c:","mydir","dir","netbeans-20-bin-mov.zip");
        try{
             Files.move(src, target,StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException ex){
            System.out.println(ex);
        }
      
    }
    
}
