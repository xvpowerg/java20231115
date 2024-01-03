/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_7_stream5;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(12);
        list.add(8);
        
    Optional<Integer>  op1 =  list.stream().reduce((v1,v2)->{
                System.out.println(v1+":"+v2);
           return v1 +v2;
        });
    System.out.println(op1.get());
    //可定義初始值
   int ans =  list.stream().reduce(23, (v1,v2)->{
                System.out.println(v1+":"+v2);
                return v1+v2;
            });
   System.out.println(ans);
   
 int ans2 =   list.stream().parallel().reduce(1, 
         (v1,v2)->{
       System.out.println("Acc:"+v1+":"+v2);
        return v1+v2;
    }, 
         (v1,v2)->{
                   System.out.println("Cmo:"+v1+":"+v2);
               return v1+v2;});
 
    System.out.println(ans2);
   
    }
    
    
    
}
