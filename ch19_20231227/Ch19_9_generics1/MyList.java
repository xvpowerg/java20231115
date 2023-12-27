/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20231227.Ch19_9_generics1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> data = new ArrayList();
    public void add(T v){
        data.add(v);
    }
    public T get(int index){
        return data.get(index);
    }
    public void foreach(Consumer<T> c){
        data.forEach(c);
    }
}
