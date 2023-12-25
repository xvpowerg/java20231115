/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20231225.ch18_2_Set2;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String data;
    
    public Item(int id,String data){
        this.id = id;
        this.data = data;        
    }
    public String toString(){
        return id+":"+data;
    }
    /*hashCode: 相同物件hashcode必須一樣
     假設兩個物件的equalse為true hashCode必須一樣
    假設兩個物件的hashCode一樣equals不一定為true 
    */
    public int hashCode(){
        return this.id+this.data.hashCode();
    }
    
    public boolean equals(Object obj){
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item tmp = (Item)obj;
        return  this.id == tmp.id && 
                this.data.equals(tmp.data);
    }
}
