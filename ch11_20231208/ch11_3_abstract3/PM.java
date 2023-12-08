/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_3_abstract3;
import ch11_20231208.ch11_3_abstract2.Employee;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class PM extends Employee {
    PM(){}
    PM(String name,String id){
        super(name,id);
    }
    protected void showList(ArrayList<String> todoList){
        System.out.println("PM:"+this.toString());
        for (String data : todoList){
            System.out.println(data);
        }
    }
}
