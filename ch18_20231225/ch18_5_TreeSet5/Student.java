/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20231225.ch18_5_TreeSet5;

/**
 *
 * @author xvpow
 */
public class Student implements Comparable<Student> {
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
    
    public String toString(){
        return this.name+":"+this.score1+":"+this.score2+":"+this.score3;
    }
    
    public int compareTo(Student st){
        if (this.score1 > st.score1){
            return 1;
        }else if(this.score1  < st.score1){
                   return -1;
        }else if(this.score2 > st.score2){
            return 1;
        }else if (this.score2  < st.score2){
            return -1;
        }else if (this.score3 > st.score3){
            return 1;
         
        }else if(this.score3 < st.score3){
            return -1;
        }
        
        return this.name.compareTo(st.name);
    }
}
