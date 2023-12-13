/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20231213.Ch13_4_interface4;

public interface TestIF3 
        extends TestIF1,TestIF2 {
    public default void print(){
        System.out.println("TestIF3");
    }
}
