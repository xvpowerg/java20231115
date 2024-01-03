/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240103.Ch2_1_Optional1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
     private String name;
     
     
     public void setName(String name){
         this.name = name;
     }
     
     public Optional<String> getName(){
         Optional op = Optional.
                 ofNullable(name);
         return op;
     }
     
     public String toString(){
         return this.name;
     }
}
