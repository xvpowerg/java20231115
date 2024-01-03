/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240103.Ch2_5_stream3;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Item i1 = new Item("A",10);
        i1.addCompany("Cmpy1");
        i1.addCompany("Cmpy2");
        i1.addCompany("Cmpy3");
        
        Item i2 = new Item("B",20);
        i1.addCompany("Cmpy2");
        i1.addCompany("Cmpy4");
        
       Item i3 = new Item("C",30);
       i3.addCompany("Cmpy5");
       i3.addCompany("Cmpy1");
       i3.addCompany("Cmpy3");
       
        list.add(i1);
        list.add(i2);
        list.add(i3);
        
        HashSet<String> compySet = new HashSet();
       for (Item it : list){
           it.getCompanyStream().forEach(v->compySet.add(v));
       } 
       System.out.println(compySet.size());
       compySet.forEach(v->System.out.println(v));
    }
    
}
