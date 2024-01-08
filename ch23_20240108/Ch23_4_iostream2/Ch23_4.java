/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_4_iostream2;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1 = new File("c:\\mydir\\myfile.txt");
       try(FileReader fr = new FileReader(f1);){
         int charData = -1;
         while ((charData = fr.read()) != -1 ){
             System.out.print((char)charData);
         }
           
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
