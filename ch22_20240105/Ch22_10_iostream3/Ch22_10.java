/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_10_iostream3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author xvpow
 */
public class Ch22_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File src = new File("c:\\mydir\\netbeans-20-bin.zip");
     File target = new File("c:\\mydir\\netbeans-20-bin_copy.zip");
       InputStream fIn = null;
       OutputStream fOut = null;
     try{
           fIn = 
                  new BufferedInputStream(new FileInputStream(src));
           fOut =
                  new BufferedOutputStream(new FileOutputStream(target));
          int data = -1;
          while( (data = fIn.read()) != -1 ){
              fOut.write(data);
          }
        
     }catch(FileNotFoundException ex){
            System.out.println(ex);
     }catch(IOException ex){
          System.out.println(ex);
     }finally{
         try{
             fOut.close();
             fIn.close();
         }catch(Exception ex){}
         
     }
     
     
    }
    
}
