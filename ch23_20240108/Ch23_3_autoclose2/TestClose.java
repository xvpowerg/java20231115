/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240108.Ch23_3_autoclose2;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private String name;
    private boolean throwEx;
    TestClose(String name,boolean throwEx){
        this.name = name;
        this.throwEx = throwEx;
    }
    TestClose(String name){
       this(name,false);
    }
    public void close() throws Exception{
        System.out.println("TestClose:"+name);
        if (throwEx){
            throw new Exception("Exception:"+name);
        }
    }
}
