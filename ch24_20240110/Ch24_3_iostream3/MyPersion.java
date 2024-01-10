/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240110.Ch24_3_iostream3;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class MyPersion implements Serializable{
    private float height;
    MyPersion(){
        
    }
    MyPersion(float height){
        this.height = height;
    }
    public float getHeight(){
        return height;
    }
}
