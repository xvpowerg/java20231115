/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class MG  extends Employee{
    MG(){}
    
    MG(String name,int age,int salary){
        super(name,age,salary);
    }
    
    public void print(){
        System.out.print("MG:");
        super.print();
    }
}
