/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20241127.ch6_3_javaoo3;

/**
 *
 * @author xvpow
 */
public class Teacher {
    private String name;
    private int age;
    Teacher(){ 
        name = "未填寫";
    }
    
    Teacher(String inName,int inAge){
//        name = inName;
//        age = inAge;
        setName(inName);
        setAge(inAge);
    }
    
    Teacher(String inName){
        //this()會呼叫建構式
        //必須寫在建構式的第一行
        this(inName,0);
//        name = inName;
//        age = 0;
    }
    
    public void setName(String inName){
        name = inName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int inAge){
        if (inAge < 0 || inAge > 200){
            System.out.println("錯誤的Age");
            return;
        }
        age = inAge;
    }
    public int getAge(){
        return age;
    }
    
    public void print(){
        System.out.println(getName()+":"+age);
    }
}
