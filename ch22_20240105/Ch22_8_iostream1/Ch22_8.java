/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_8_iostream1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file1 = new File("c:\\mydir\\myfile.txt");
        File copyFile = new File("c:\\mydir\\copy_myfile.txt");
        try{
              FileInputStream fIn = new FileInputStream(file1);
              FileOutputStream fOut = new FileOutputStream(copyFile);
              int data = -1;
              while( (data = fIn.read()) != -1){
                fOut.write(data);
              }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
             System.out.println(ex);
        }
     
    }
    
}
