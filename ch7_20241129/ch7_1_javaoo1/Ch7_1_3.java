/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class Ch7_1_3 {

     static Employee maxSalaryEmployee(Employee ... emps){
         Employee result = emps[0];
         for (Employee emp :emps){
             if (emp.getSalary() > result.getSalary()){
                 result = emp;
             }
         }
         return result;
     }
    public static void main(String[] args) {
        // TODO code application logic here
         PM pm = new PM("Joy",30,45000);
         RD rd = new RD("NoNo",27,25000);
        MG mg = new MG("Iris",51,81000);
       Employee maxEmp =  maxSalaryEmployee(pm,rd,mg);
       maxEmp.print();
    }
    
}
