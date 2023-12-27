/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20231227.Ch19_10_generics2;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Test<T extends List<T2>,T2> {
    private T data;
    Test(T data){
        this.data = data; 
    }

    public void add(T2 v){
        data.add(v);
    }
    public T2 get(int index){
        return data.get(index);
    }
    
}
