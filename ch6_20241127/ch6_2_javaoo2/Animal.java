/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20241127.ch6_2_javaoo2;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;//幫我封裝 
    //name 長度必須大於等於2 不可為null 有錯就顯示錯誤的name
    int height;
    private float weight;
    
    public void setName(String inName){
        if (inName == null || inName.length() < 2 ){
            System.out.println("錯誤的Name");
            return;
        }
        name = inName;
    }
    public String getName(){
        return name;
    }
    public void setWeight(float inWeight){
        if (inWeight < 1 || inWeight > 200){
            System.out.println("錯誤的weight");
           return;
           
        }
        
        weight = inWeight;
    }
    public float getWeight(){
        return weight;
    }
    
    void print(){
        System.out.println(getName()+":"+height+":"+getWeight());
    }
}
