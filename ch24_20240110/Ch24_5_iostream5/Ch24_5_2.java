/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240110.Ch24_5_iostream5;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        File file = new File("c:\\mydir\\my_user.boj");
        try(FileInputStream fileIn = 
                new FileInputStream(file);
            ObjectInputStream objIn = 
                    new  ObjectInputStream(fileIn)   ){
           System.out.println(objIn.readObject());
        }
    }
    
}
