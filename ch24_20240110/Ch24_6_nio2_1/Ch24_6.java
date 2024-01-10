/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_6_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileStore;
import java.util.Iterator;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       Path p1 =  Paths.get("C:","mydir","myfile.txt");
       System.out.println(p1);
       System.out.println(p1.getFileName());
       for(FileStore fs : p1.getFileSystem().getFileStores()){
           System.out.println(fs.getTotalSpace()/1024.0/1024/1024.0);
            System.out.println(fs.getUsableSpace()/1024.0/1024/1024);
       }
    }
    
}
