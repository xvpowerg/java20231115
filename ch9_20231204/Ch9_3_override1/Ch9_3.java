/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20231204.Ch9_3_override1;

public class Ch9_3 {
    /*
    Modifier只能開放不能封閉
    回傳值 如果是基本型態必須一樣 如果是參考型態可是子類
    方法名稱參數類型必須一樣
    例外 可拋子類 也可不拋
    */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test2();
        t1.testPublic();
        t1.testProtected();
        t1.testDefault();
    }
    
}
