/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20231211.Ch12_9_interfece6;
import java.util.List;
/**
 *
 * @author xvpow
 */
public interface MyIterator {
    public List<String> getData();
    public default void foreach(){
        List<String> data =  getData();
        for (String s : data){
            System.out.println(s);
        }
    }
}
