/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_1_Optional1;

/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        //st1.setName("Lucy");
        if (st1.getName().isPresent() && 
                st1.getName().get().length() >= 3 ){
            System.out.println("正確");
        }else{
            System.out.println("不正確");
        }
    }
    
}
