/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ch16_20231220_modu1.beans;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }
    public String toString(){
        return "Student:"+this.name;
    }
}
