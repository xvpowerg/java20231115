/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_6_exception2;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    //例外分2種
    //必要檢測 直接繼承Exception
    //非必要檢測 繼承RuntimeException
    public void testEx1(int v)throws IOException{
        if (v > 10){
            throw new IOException();
        }
    }
    public void testEx2(int v2){
        if (v2 > 10){
            throw new RuntimeException();
        }
    }
    
    public void testEx3(int v)throws IOException,SQLException{
        if (v > 20){
            throw new IOException();
        }else if(v > 10){
             throw new SQLException();
        }
    }
}
