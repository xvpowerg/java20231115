/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20231220.Ch16_1_lambda1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(){}
     Student(String name){
        this.name = name;
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name+":"+this.age;
    }
}
