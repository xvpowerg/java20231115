/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240110.Ch24_5_iostream5;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyUser implements Serializable{
    private String name;
    private int age;
    private LocalDateTime creatDateTime = LocalDateTime.now();
    public MyUser(){}
    public MyUser(String name,int age){
        this.name = name;
        this.age = age;
    }
    //我可以控制序列化過程
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{
        System.out.println("writeObject");
        out.writeObject(name);
        out.writeInt(age);
    }
    private void readObject(java.io.ObjectInputStream in)throws IOException,ClassNotFoundException{
        System.out.println("readObject!");
        this.name = in.readObject().toString();
        this.age = in.readInt();
        this.creatDateTime = LocalDateTime.now();
    }
    public String toString(){
        return this.name+":"+this.age+":"+creatDateTime;
    }
}
