/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
//繼承
public class PM  extends Employee{
    //封裝
    //繼承
    //多型
    PM(){}
    PM(String name,int age,int salary){
        //super() 呼叫父類別建構式
        //只能在第一行
        //不能與this()同時出現
        super(name,age,salary);
//        this.setName(name);
//        this.setAge(age);
//        this.setSalary(salary);
    }
    //Override
    public void print(){
        System.out.print("PM:");
        super.print();
  
        //System.out.println(this.getName()+":"+this.getAge()+":"+this.getSalary());
    }
    
}
