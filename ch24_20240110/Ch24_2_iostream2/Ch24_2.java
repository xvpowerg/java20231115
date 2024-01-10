/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_2_iostream2;
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
public class Ch24_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyUser myUser = new MyUser("Ken",18);
        File file = new File("c:\\mydir\\my_user.boj");
        try(FileOutputStream fOut = new FileOutputStream(file);
           ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            FileInputStream fIn = new  FileInputStream(file);   
            ObjectInputStream bojIn = new ObjectInputStream(fIn);    
                ){
            objOut.writeObject(myUser);
           System.out.println(bojIn.readObject());
            
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
