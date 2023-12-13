/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20231213.Ch13_6_interface6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {
    //static 只能呼叫static
    //非static可呼叫static或非static
    public static int myCmp(List<Integer> list,MyFunc cmpFunc){
        int result = list.get(0);
        for (int v : list){
           result =  cmpFunc.cmp(v,result);
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList();
         list.add(10);
         list.add(2);
          list.add(30);
         list.add(6);
         list.add(7);
      MaxFunc maxF1 = new MaxFunc();
     int max =   myCmp(list,maxF1);
     System.out.println(max);
     
     int min = myCmp(list,new MyFunc(){
         public int cmp(int v1,int v2){
             return v1 < v2 ? v1 : v2;
         }
     });
     System.out.println(min);
     
     int max2 = myCmp(list,(int v1,int v2)->{
                            return v1 > v2 ? v1 : v2;
                        }); 
     System.out.println(max2);
    }
    
}
