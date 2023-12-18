/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20231218.Ch15_2_InnerClass2;

/**
 *
 * @author xvpow
 */
public class TestInnerClass {
    public static class TestStaticClass{
        private String name;
        private String id;
       TestStaticClass(String name,String id){
            this.name = name;
            this.id = id;
       } 
       public String toString(){
           return this.name+":"+this.id;
       }
    }
}
