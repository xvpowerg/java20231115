/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_2_abstract1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    Animal(){}
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name +":"+this.age;
    }
   
}
