/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20231204.Ch9_5_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        if (age < 10 || age > 200){
           // System.out.println("錯誤的年齡");
            //return;
            //IllegalArgumentException 無效參數的錯誤
            throw new IllegalArgumentException("錯誤的年齡");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printInfo(){
        System.out.println(name+":"+age);
    }
}
