/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_5_initblock1;

/**
 *
 * @author xvpow
 */
public class Test1 {
   private String[] msgArray = new String[100];
    {
   
      for (int i =0; i <msgArray.length ;i++){
            msgArray[i] = "";
     }
   }
   public Test1(String msg){
        
    }
   public Test1(){
     
    }
    
    public String getArrayValue(int index){
        return msgArray[index];
    }
}
