/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_1_iostream1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch24_1 {
    
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\map.obj");
        HashMap<String,String> map = new HashMap<>();
        Random ran = new Random();
        for (int i =1;i <= 100000;i++){
            map.put(ran.nextInt(Integer.MAX_VALUE)+"", 
                    ran.nextInt(Integer.MAX_VALUE)+"");
        }
        
       try(FileOutputStream fout = new FileOutputStream(file);
         ObjectOutputStream objOut = new ObjectOutputStream(fout);)
               {
           objOut.writeObject(map);
       }catch(IOException ex){
           System.out.println(ex);
       }
        
        
    }
    
}
