/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_1_exception1;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testEx1(int v)throws IOException,SQLException{
        if (v > 20){
            throw new IOException();
        }else if(v > 10){
            throw new SQLException();  
        }
    }
    
    public void testEx2(int v2) throws FileNotFoundException,IOException{
        if (v2 > 30) {
            throw new FileNotFoundException();
        } else if (v2 > 10) {
            throw new IOException();
        }
    }
    
//    public void testEx2(int v2)throws FileNotFoundException,IOException{
//        if (v2 > 30){
//            throw new FileNotFoundException();
//        }else if (v2 > 10){
//            throw new IOException();
//        }
//    }
    

}
