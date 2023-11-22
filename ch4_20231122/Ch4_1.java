/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20231122;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {
    //void 不回傳
    //non-static 無法在static內呼叫
   static void test(){
        System.out.println("Test!");
    }
   static void testForLoop(int x){
       for (int i =1; i<=x;i++){
         System.out.print(i+" ");
     }
     System.out.println();
   }
   
   static void testForLoop2(int s,int e){
       if (s >= e){
           System.out.println("Error");
       }else{
             for (int i = s; i <= e; i++){
                   System.out.print(i+" ");
                }
            System.out.println(); 
       }
     
   }
    public static void main(String[] args) {
     test();
     testForLoop(10);
     testForLoop(20);
     testForLoop2(5,10);   
     testForLoop2(2,8);   
    }
    
}
