/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_2_javaoo3;


public class PM  extends Employee{
    PM(String name,int salary){
        super(name,salary);
    }
    
    public int getSalary(){
        return super.getSalary()+ 2000;
    }
}
