/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240110.Ch24_3_iostream3;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class MyUser extends MyPersion implements Serializable{
    private String name;
    private int age;
    public MyUser(){
    super(0);
    }
    public MyUser(String name,int age,float height){
        super(height);
        this.name = name;
        this.age = age;
        
    }
    
    public String toString(){
        return this.name+":"+this.age+":"+this.getHeight();
    }
}
