/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20231218.Ch15_4_InnerClass4;

/**
 *
 * @author xvpow
 */
public class Dog {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void bark(){
        System.out.println(getName()+"汪汪!");
    }
    
}
