/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20231213.Ch13_7_interface7;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TitlePrint implements Consumer<String>{
    private String title = "Title:";
    TitlePrint(){}
    TitlePrint(String title){
        this.title = title;
    }
    public void accept(String v){
        System.out.println(title+v);
    }
}
