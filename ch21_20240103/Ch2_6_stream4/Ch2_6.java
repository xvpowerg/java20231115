/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_6_stream4;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    public static void main(String[] args) {
       ArrayList<Integer> priceList = new ArrayList<>();
       priceList.add(25);
       priceList.add(32);
       priceList.add(29);
       priceList.add(31);
       IntSummaryStatistics iss = 
               priceList.stream().mapToInt(v->v).summaryStatistics();
   System.out.println(iss.getAverage()); 
   System.out.println(iss.getSum()); 
   System.out.println(iss.getMax()); 
   System.out.println(iss.getMin()); 
    }
    
}
