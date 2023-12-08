/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_1_equals1;

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
    
   public String toString(){
       return this.name+":"+this.score;
   }
   
   public boolean equals(Object obj){
//       if (obj.getClass().getName() != Student.class.getName()){
//           return false;
//       }
//obj instanceof Student 表示obj變數的類型是否為Student 是回傳true
       if (obj == null || obj instanceof Student == false ){
            return false;
        }
       Student st = (Student)obj;
       boolean result = this.score == st.score 
               && this.name.equals(st.name) ;
       return result;
   }
}
