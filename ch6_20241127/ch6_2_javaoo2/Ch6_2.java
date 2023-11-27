/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20241127.ch6_2_javaoo2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    //封裝
    public static void main(String[] args) {
        Animal a1 = new Animal();
        //a1.name = "Bobo";
        //a1.setName("Bobo");
       // a1.setName("");
        a1.setName(null);
        //a1.weight = 5;
        //a1.setWeight(-5);
        a1.setWeight(5);
        a1.height = 13;
        a1.print();
        System.out.println(a1.getWeight());
    }
    
}
