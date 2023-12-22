/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20231222.Ch17_6_list4;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name+":"+this.age;
    }
    
    public boolean equals(Object obj){
        Student st = (Student)obj;
        return this.age == st.age && this.name.equals(st.name);
    }
}
