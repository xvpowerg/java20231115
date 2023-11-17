/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20231117;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    public static void main(String[] args) {
      int[] score = new int[3];
      score[0] = 75;
      score[1] = 83;
      score[2] = 66;
       
      System.out.println(score[1]);
      System.out.println("=========================");
      
      for (int i = 0; i < 3;i++){
          System.out.println(score[i]);
      }
      
      
      for (int v : score){
          System.out.print(v+" ");
      }
          System.out.println();
          
     int[] score2 = new int[4];
     score2[0] = 98;
     score2[1] = 76;
     score2[2] = 88;
     score2[3] = 92;
     //總成績
     //成績平均
     int sum = 0;
     for (int i = 0; i < score2.length; i++){
         System.out.println(i+":"+score2[i]);
         sum += score2[i];
     }
      System.out.println(sum);
      System.out.println(sum/(float)score2.length);
    }
    
}
