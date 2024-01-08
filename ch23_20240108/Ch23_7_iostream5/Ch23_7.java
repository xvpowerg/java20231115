/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240108.Ch23_7_iostream5;
import java.io.File;
import java.io.BufferedReader;
import ch23_20240108.Ch23_6_iostream4.MyFileReader;
public class Ch23_7{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
     File file = new File("c:\\mydir\\myfile.txt");   
        try(BufferedReader br = new  
            BufferedReader(new MyFileReader(file,"big5"));   ){
            String data = null;
            while ((data = br.readLine()) != null){
                System.out.println(data);
            }
        }
    }
    
}
