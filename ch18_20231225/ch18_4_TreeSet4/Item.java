/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20231225.ch18_4_TreeSet4;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item> {
    private int id;
    private String name;
    public Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id+":"+this.name;
    }
    public int compareTo(Item item){
        /*目前大於傳入的回傳正數
          目前小於傳入的回傳負數
          目前等於傳入的回傳0
        */
        if (this.id >item.id){
            return 1;
        }else if(this.id  < item.id){
            return -1;  
        }
        return 0;
    }
}
