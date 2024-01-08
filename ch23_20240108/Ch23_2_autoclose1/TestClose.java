/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240108.Ch23_2_autoclose1;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private String name;
    TestClose(String name){
        this.name = name;
    }
    public void close() throws Exception{
        System.out.println("TestClose:"+name);
    }
}
