/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20231213.Ch13_8_interface8;
import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    /**
     * @param args the command line arguments
     */
    
    public static  List<String> group(List<String> values,
            Supplier<List<String>> listSup ){
        List<String> result = listSup.get();
        for(String msg : values){
            if (msg.length() > 3){
                result.add(msg);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //Supplier<T> T get() 提供
        MyArrayListSupplier listSup = new MyArrayListSupplier();
        List<String> msgList = new ArrayList(); 
        msgList.add("Ken");
         msgList.add("Vivin");
         msgList.add("Nono");
         msgList.add("Iris");
       List<String> groupList =  group(msgList,listSup);
       System.out.println(groupList);
    }
    
}
