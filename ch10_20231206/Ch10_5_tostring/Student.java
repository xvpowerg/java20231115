/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_5_tostring;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return String.format("name:%s age%d",
                this.name,this.age);
    }
}
