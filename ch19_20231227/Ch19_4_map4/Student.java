/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20231227.Ch19_4_map4;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    
    public String toString(){
        return this.getName()+":"+this.score;
    }
}
