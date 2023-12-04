/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_2_javaoo3;

/**
 *
 * @author xvpow
 */
public class RD extends Employee {
    RD(String name,int salary){
        super(name,salary);
    }
    //+1000
    public int getSalary(){
        return super.getSalary()+1000;
    }
}
