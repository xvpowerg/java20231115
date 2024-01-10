/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_5_iostream5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
      MyUser myUser = new MyUser("Vivin",25);
      System.out.println(myUser);
         File file = new File("c:\\mydir\\my_user.boj");
      try(FileOutputStream fout = new FileOutputStream(file);
          ObjectOutputStream objOut = 
                  new ObjectOutputStream(fout)){
          objOut.writeObject(myUser);
      }
      
    }
    
}
