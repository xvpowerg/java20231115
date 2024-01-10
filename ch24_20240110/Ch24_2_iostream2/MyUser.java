/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240110.Ch24_2_iostream2;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class MyUser implements Serializable{
    private String name;
    private int age;
    public MyUser(){}
    public MyUser(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return this.name+":"+this.age;
    }
}
