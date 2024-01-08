/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_9_iostream7;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\myobj.obj");
        ArrayList<String> list = new ArrayList<>();
        try(FileOutputStream fout = new FileOutputStream(file);
           ObjectOutputStream objOut = new ObjectOutputStream(fout)){
            list.add("Ken");
            list.add("Vivin");
            list.add("Lucy");
            objOut.writeObject(list);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
