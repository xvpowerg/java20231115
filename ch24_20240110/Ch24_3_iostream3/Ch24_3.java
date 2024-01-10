/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_3_iostream3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyUser myUser = new MyUser("Ken",18,175.2f);
        File file = new File("c:\\mydir\\my_user.boj");
        try(FileOutputStream fOut = new FileOutputStream(file);
           ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            FileInputStream fIn = new  FileInputStream(file);   
            ObjectInputStream bojIn = new ObjectInputStream(fIn);    
                ){
            System.out.println("Step 1");
            objOut.writeObject(myUser);
            System.out.println("Step 2");
           System.out.println(bojIn.readObject());
              System.out.println("Step 3");  
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
