/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_9_interfece6;
import java.util.ArrayList;
import java.util.List;

public class MyArray implements MyIterator {
    private List<String> myArrayList 
            = new ArrayList<>();
    public List<String> getData(){
        return myArrayList;
    }
    
    public void add(String v){
        myArrayList.add(v);
    }
    
}
