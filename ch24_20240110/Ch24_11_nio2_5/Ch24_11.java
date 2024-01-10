/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_11_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path src = 
              Paths.get("c:","mydir","netbeans-20-bin.zip");
       Path target = 
              Paths.get("c:","mydir","netbeans-20-bin-copy.zip");
           // 預設target存在會拋出java.nio.file.FileAlreadyExistsException
            try{
                Files.copy(src, target,
                        StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException ex){
                System.out.println(ex);
            } 
    }
    
}
