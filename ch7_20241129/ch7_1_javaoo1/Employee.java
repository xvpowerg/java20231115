/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20241129.ch7_1_javaoo1;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int age;
    private int salary;
    Employee(){}
    Employee(String name,int age,int salary){
        //區域變數
        //this.可呼叫全域的內容(屬性 方法)
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    
    public void print(){
        System.out.println(this.getName()+":"+
                this.getAge()+":"+getSalary());
    }
}
