/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20231225.ch18_6_TreeSet6;

/**
 *
 * @author xvpow
 */
public class Item {
        private int id;
    private String name;
    public Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return this.id+":"+this.name;
    }
}
