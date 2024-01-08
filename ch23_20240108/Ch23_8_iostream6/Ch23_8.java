/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_8_iostream6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch23_8 {
    
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\mywriter.txt");
        try(  FileWriter fw = new FileWriter(file);){
            fw.write("Hello!mywriter");
        }catch(IOException ex){
            System.out.println(ex);
        }
      
    }
    
}
