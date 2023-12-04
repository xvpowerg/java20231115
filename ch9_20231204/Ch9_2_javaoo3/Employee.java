/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_2_javaoo3;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int salary;
   
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;        
    }
    
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return salary;
    }
    
    public void printInfo(){
        System.out.println(this.getName()+":"+this.getSalary());
    }
}
