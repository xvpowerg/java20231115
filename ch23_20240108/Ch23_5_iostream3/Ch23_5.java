/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_5_iostream3;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file =  new File("c:\\mydir\\myfile.txt");
     try(FileInputStream fin = new FileInputStream(file);
         InputStreamReader inStr = new InputStreamReader(fin,"big5");){
         int charData = -1;
         
         while ( (charData = inStr.read()) != -1){
             System.out.print((char)charData);
         }
     
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){
         System.out.println(ex);
     }
    }
    
}
