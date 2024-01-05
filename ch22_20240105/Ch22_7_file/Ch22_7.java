/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_7_file;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch22_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file1 = new File("C:\\mydir\\myfile.txt"); 
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.exists());
    }
    
}
