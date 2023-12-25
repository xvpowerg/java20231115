/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20231225.ch18_7_TreeSet7;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score1;
    private int score2;
    private int score3;
    public Student(String name,int score1,int score2,int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    
    public int getScore1(){
        return this.score1;
    }
    public int getScore2(){
        return this.score2;
    }
    public int getScore3(){
        return this.score3;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name+":"+this.score1+":"+this.score2+":"+this.score3;
    }
    
}
