/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_1_iostream1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_1 {

  
    public static void main(String[] args) {
       File src = new File("C:\\mydir\\netbeans-20-bin.zip");
       File target = new File("C:\\mydir\\netbeans-20-bin-copy.zip");
       try(FileInputStream fin = new FileInputStream(src);
           FileOutputStream fout = new FileOutputStream(target);    ){
           int index = -1;
           byte[] buffer = new byte[2048*8];
           while( (index = fin.read(buffer))!= -1 ){
               fout.write(buffer, 0, index);
           }
           
       }catch(FileNotFoundException ex){
            System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
