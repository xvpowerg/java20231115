/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20231204.Ch9_5_exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    public static void main(String[] args) {
        
        Student st1 = new Student();
        st1.setName("Ken");
        st1.setAge(12);//10~200 超過範圍顯示錯誤的年齡
        st1.printInfo();
    }
    
}
