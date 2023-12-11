/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20231211.Ch12_3_initorder;

/**
 *
 * @author xvpow
 */
public class TestInitOrder {
    {
        //每new一次呼叫一次
    System.out.println("Init block1");
    }
    
    static{
        //只會呼叫一次
     System.out.println("static Init block1");
    }
    TestInitOrder(){
        //在所有區塊呼叫完畢後才會呼叫
    System.out.println("TestInitOrder()");     
    }
    static{
     System.out.println("static Init block2");
    }
    
    {
    System.out.println("Init block2");
    }
}
