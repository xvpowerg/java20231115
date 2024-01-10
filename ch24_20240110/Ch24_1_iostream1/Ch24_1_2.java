/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_1_iostream1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File file = new File("c:\\mydir\\map.obj");
      try(FileInputStream fin = new FileInputStream(file);
          ObjectInputStream objIn = new ObjectInputStream(fin);    ){
          
          Object obj =  objIn.readObject();
          System.out.println(obj);
      }catch(IOException | ClassNotFoundException ex){
          System.out.println(ex);
      }
    }
    
}
