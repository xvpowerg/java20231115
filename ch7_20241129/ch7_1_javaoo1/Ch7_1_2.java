/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class Ch7_1_2 {

    
    public static void main(String[] args) {
      //多型
      PM pm = new PM("Joy",30,45000);
      RD rd = new RD("NoNo",27,25000);
      MG mg = new MG("Iris",51,81000);
      pm.print();
      rd.print();
      
      Employee emp1 = pm;
      emp1.print();
      Employee emp2 = rd;
      emp2.print();
      //利用多型減少程式修改的機率
      Employee[] empArray = new Employee[3];
      empArray[0] = pm;
      empArray[1] = rd;
      empArray[2] = mg;
      for (Employee emp : empArray){
         System.out.print("v:"); emp.print();
      }
    }
    
}
