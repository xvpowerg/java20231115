/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20240105.Ch22_5_stream5;

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
        return this.getName()+":"+this.getScore();
    }
}
