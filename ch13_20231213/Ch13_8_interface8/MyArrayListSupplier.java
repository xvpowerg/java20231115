/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20231213.Ch13_8_interface8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class MyArrayListSupplier implements Supplier<List<String>>{
    public List get(){
        return new ArrayList();
    }
}
