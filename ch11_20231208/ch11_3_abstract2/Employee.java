/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_3_abstract2;
import java.util.ArrayList;
public abstract class Employee {
    private String name;
    private String id;
    private ArrayList<String> todoList = new ArrayList();
    public Employee(){}
    public Employee(String name,String id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return this.name+":"+this.id;
    }
    public void addToDo(String todo){
        todoList.add(todo);
    }
    
    public void printToDoList(){
        System.out.println("輸出ToDo Start:");
        showList(todoList);
        System.out.println("輸出ToDo End:");
    }
    protected abstract void showList(ArrayList<String> todoList);
}
