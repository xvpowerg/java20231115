/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20231208.ch11_4_static1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    private static String msg2;//因為他是靜態的所以資源共享
    public Test1(String msg,String myMsg2){
        this.msg = msg;
        msg2 = myMsg2;
    }
    
    public static void setMsg2(String myMsg2){
        msg2 = myMsg2;
    }
    public static String getMsg2(){
        return msg2;
    }
    public String toString(){
        return this.msg+":"+msg2;
    }
}
