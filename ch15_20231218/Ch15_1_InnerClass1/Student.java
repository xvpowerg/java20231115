/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20231218.Ch15_1_InnerClass1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int id;
    private ArrayList<Phone> 
            phoneList = new ArrayList<>();
    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void addPhone(Phone p){
        phoneList.add(p);
    }
    
    public void addPhone(String type,String number){
        Phone p1 = new Phone(type,number);
        phoneList.add(p1);
    }
    public String toString(){
        return name+":"+id+":"+phoneList;
    }
    public class Phone{
        private  String type;
        private String number;
        public Phone(String type,String number){
            this.type = type;
            this.number = number;
        }
        public String toString(){
            return name+":"+ this.type+":"+this.number;
        }
    }
    
}
