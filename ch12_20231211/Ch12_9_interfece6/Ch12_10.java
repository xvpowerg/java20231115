/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20231211.Ch12_9_interfece6;

/**
 *
 * @author xvpow
 */
public class Ch12_10 {

    public static void showArray(MyIterator it){
        it.foreach();
    }
    public static void main(String[] args) {
       MyArray myArray = new MyArray();
       myArray.add("A");
       myArray.add("B");
       myArray.add("C");
       showArray(myArray);
    }
    
}
