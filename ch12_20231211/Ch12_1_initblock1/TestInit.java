/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_1_initblock1;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class TestInit {
    private String[] msgArray = new String[100];
    {
     Arrays.fill(msgArray, "Empty");
    }
    TestInit(){
   
    }
    TestInit(String msg){
        
    }
    
    public String getMsg(int index){
        return msgArray[index];
    }
    
}
