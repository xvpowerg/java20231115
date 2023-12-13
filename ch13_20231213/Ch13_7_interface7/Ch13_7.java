/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20231213.Ch13_7_interface7;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch13_7 {
    
    public static  void showMyList(List<String> msgList,Consumer<String> func){
        for (String m : msgList){
            //System.out.println(m);
            func.accept(m);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Consumer<T> void accept​(T t) 接收
        //Supplier<T> T get() 提供
        //Function<T,​R>	R apply​(T t) 轉換
        //UnaryOperator<T> T apply​(T t) 一元運算
        //Predicate<T>boolean	test​(T t) 測試條件
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        
        showMyList(list,new TitlePrint("姓名:"));
        
    }
    
}
