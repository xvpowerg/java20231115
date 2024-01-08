/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_9_iostream7;
import java.io.FileInputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_9_2 {
    public static void main(String[] args) {
       File file = new File("c:\\mydir\\myobj.obj");
      try(FileInputStream fin = new FileInputStream(file);
         ObjectInputStream objIn = new ObjectInputStream(fin)){
         ArrayList<String> list =   (ArrayList)objIn.readObject();
          System.out.println(list);
      } catch(IOException | ClassNotFoundException ex){
          System.out.println(ex);
      }
    }
    
}
