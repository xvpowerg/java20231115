/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240112.Ch25_5_location1;

import java.util.ResourceBundle;
import java.util.Locale;
/**
 *
 * @author xvpow
 */
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //沒指定 Locale 使用查看系統預設語系
        //有指定 Locale  指定語系的properties是否存在 存在就使用 不存在 使用default properties
        //以上都不存在的key 使用default properties
       ResourceBundle res = ResourceBundle.getBundle("messages");
       System.out.println(res.getString("tw.com.welcom"));
       System.out.println(res.getString("tw.com.name"));
       System.out.println(res.getString("tw.com.color"));
       System.out.println(res.getString("tw.com.edit"));
       Locale local = new Locale("ja","JP");
       ResourceBundle res2 = ResourceBundle.getBundle("messages",local);
       System.out.println(res2.getString("tw.com.welcom"));
       System.out.println(res2.getString("tw.com.name"));
       System.out.println(res2.getString("tw.com.color"));
       System.out.println(res2.getString("tw.com.edit")); 
       
    }
    
}
