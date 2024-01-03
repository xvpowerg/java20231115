/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240103.Ch2_5_stream3;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    private List<String> companyList = new ArrayList();
    
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public void addCompany(String name){
        this.companyList.add(name);
    }
    public String toString(){
        return this.name+":"+this.price;
    }
    public Stream<String> getCompanyStream(){
        return companyList.stream();
    }
    
}
