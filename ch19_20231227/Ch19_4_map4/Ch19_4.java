/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20231227.Ch19_4_map4;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch19_4 {
    public static void main(String[] args) {
      
        ArrayList<Student> list = new ArrayList();
        list.add(new Student("Ken",83));
        list.add(new Student("Iris",85));
        list.add(new Student("Lucy",65));
        list.add(new Student("Ken",94));
        list.add(new Student("Ken",71));
        list.add(new Student("Iris",82));
        list.add(new Student("Lucy",91));
        list.add(new Student("Ken",56));
        list.add(new Student("Lucy",83));
        
        //使用map 幫我將成績用姓名分組 
        //Ken 83 94 74 56 
        //Iris 85 82 
        //Lucy 65 91 83
        
        HashMap<String,ArrayList<Integer>> stGroupMap = new HashMap();
        
        for (Student st : list){
            ArrayList<Integer> tmpList = new ArrayList();
            tmpList.add(st.getScore());
            stGroupMap.merge(st.getName(), tmpList, (v1,v2)->{
                v1.addAll(v2);
                return v1;
            });
        }
        System.out.println(stGroupMap);
    }
    
}
