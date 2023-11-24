/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20231124;
/**
 *
 * @author xvpow
 */
public class Ch5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //不可修改
       String msg = "Ken";
       msg = "Vivin";
  
      System.out.println(msg.toLowerCase());
      System.out.println(msg);
      System.out.println(msg.toUpperCase());
      System.out.println(msg.charAt(0));
      System.out.println(msg.charAt(1));
      
      for (int i = 0;i < msg.length();i++){
          System.out.println(msg.charAt(i));
      }
      
      byte[] byte1 = msg.getBytes();
    }
    
}
