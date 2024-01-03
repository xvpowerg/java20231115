/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240103.Ch2_4_stream2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return this.name+":"+this.price;
    }
    
}
