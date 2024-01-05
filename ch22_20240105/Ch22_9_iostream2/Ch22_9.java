/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_9_iostream2;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     File src = new File("c:\\mydir\\netbeans-20-bin.zip");
     File target = new File("c:\\mydir\\netbeans-20-bin_copy.zip");
     try{
          InputStream fIn = 
                  new BufferedInputStream(new FileInputStream(src));
          OutputStream fOut =
                  new BufferedOutputStream(new FileOutputStream(target));
          int data = -1;
          while( (data = fIn.read()) != -1 ){
              fOut.write(data);
          }
          fOut.close();
          fIn.close();
     }catch(FileNotFoundException ex){
            System.out.println(ex);
     }catch(IOException ex){
          System.out.println(ex);
     }
    
     
    }
    
}
